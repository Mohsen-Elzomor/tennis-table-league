package com.poc.league.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
public class Tournament implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String tournamentName;
    private String location;
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Temporal(TemporalType.DATE)
    private Date endDate;
    private Integer numberOfRounds;
    @ManyToOne
    @JoinColumn(name = "tournament_type_id")
    private TournamentType tournamentType;
    @ManyToOne
    @JoinColumn(name = "surface_type_id")
    private SurfaceType surfaceType;
}
