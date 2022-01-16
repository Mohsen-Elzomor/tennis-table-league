package com.poc.league.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ParticipantDto {
    private String firstName;
    private String lastName;
    private String email;
}
