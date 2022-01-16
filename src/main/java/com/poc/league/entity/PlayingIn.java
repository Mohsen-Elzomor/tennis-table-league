package com.poc.league.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class PlayingIn  implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "registration_id")
    private Registration registration;

    private Integer seed;

    @ManyToOne
    @JoinColumn(name = "tournament_playing_category_id")
    private TournamentPlayingCategory tournamentPlayingCategory;
}
