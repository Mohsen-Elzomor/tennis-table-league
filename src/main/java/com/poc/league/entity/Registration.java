package com.poc.league.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
public class Registration implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Temporal(TemporalType.DATE)
    private Date registrationDate;

    @ManyToOne
    @JoinColumn(name = "registration_id")
    private Registration registration;

    private Integer seed;

}
