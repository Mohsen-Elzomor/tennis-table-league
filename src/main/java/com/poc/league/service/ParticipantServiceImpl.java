package com.poc.league.service;

import com.poc.league.dto.ParticipantDto;
import com.poc.league.entity.PlayingIn;
import com.poc.league.entity.Registration;
import com.poc.league.entity.RegistrationPlayer;
import com.poc.league.repository.PlayingInRepository;
import com.poc.league.repository.RegistrationPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ParticipantServiceImpl implements ParticipantService{

    @Autowired
    private PlayingInRepository playingInRepository;

    @Autowired
    private RegistrationPlayerRepository registrationPlayerRepository;

    @Override
    public List<ParticipantDto> getAllParticipants() {
        List<ParticipantDto> participantDtoList = new ArrayList<>();
        List<PlayingIn> playingIns = playingInRepository.findAll();
        if(playingIns != null & !playingIns.isEmpty()){
            List<Registration> registrations = playingIns.stream().map(PlayingIn::getRegistration).collect(Collectors.toList());
            List<RegistrationPlayer> registrationPlayers = registrationPlayerRepository.findAllByRegistrationIn(registrations);
            participantDtoList = registrationPlayers.stream().map(p -> {
                ParticipantDto participantDto = new ParticipantDto();
                participantDto.setFirstName(p.getPlayer().getFirstName());
                participantDto.setLastName(p.getPlayer().getLastName());
                participantDto.setEmail(p.getPlayer().getEmail());
                return participantDto;
            }).collect(Collectors.toList());
        }
        return participantDtoList;
    }
}
