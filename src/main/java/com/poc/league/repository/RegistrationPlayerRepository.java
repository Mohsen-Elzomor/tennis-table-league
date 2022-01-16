package com.poc.league.repository;

import com.poc.league.entity.Registration;
import com.poc.league.entity.RegistrationPlayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistrationPlayerRepository extends JpaRepository<RegistrationPlayer,Long> {
    List<RegistrationPlayer> findAllByRegistrationIn(List<Registration> registration);
}
