package com.example.ormpractice.elif.mapper;

import com.example.ormpractice.elif.entityElif.AirportEntity;
import com.example.ormpractice.elif.dto.AirportDto;

public class AirportMapper {
    public static AirportDto AirportToAirportDto(AirportEntity airportEntity){
       return new AirportDto(airportEntity.getAirportName(),
               airportEntity.getAirportCode(),
               airportEntity.getLocationId() );
    }
}
