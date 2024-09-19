package com.example.ormpractice.elif.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AirportDto {
    private String AirportName;
    private int AirportCode;
    private int LocationId;


}
