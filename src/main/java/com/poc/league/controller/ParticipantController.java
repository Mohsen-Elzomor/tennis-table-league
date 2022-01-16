package com.poc.league.controller;

import com.poc.league.dto.ParticipantDto;
import com.poc.league.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("participants")
public class ParticipantController {

    @Autowired
    private ParticipantService participantService;

    @GetMapping("/getallparticipants")
    public List<ParticipantDto> getAllParticipants(){
        return participantService.getAllParticipants();
    }


}
