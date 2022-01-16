package com.poc.league.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
public class Player  implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Character gender;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "country_code")
    private Country country;
}
