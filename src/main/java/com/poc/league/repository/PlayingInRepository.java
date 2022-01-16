package com.poc.league.repository;

import com.poc.league.entity.PlayingIn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayingInRepository extends JpaRepository<PlayingIn,Integer> {
    public List<PlayingIn> findAll();
}
