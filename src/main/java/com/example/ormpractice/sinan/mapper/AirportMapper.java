package com.example.ormpractice.sinan.mapper;

import com.example.ormpractice.sinan.dto.AirportDto;
import com.example.ormpractice.sinan.entity.Airport;

public class AirportMapper {

    public static AirportDto EntityToDto(Airport airport) {

        return new AirportDto(airport.getAirportName(),
                airport.getAirportCode(),
                airport.getLocationId(),
                airport.getStatus());
    }

    public static Airport  AirportDtoToAriportEntity(AirportDto airportDto){
        Airport tmp = new Airport();
        tmp.setAirportName(airportDto.getAirportName());
        tmp.setAirportCode(airportDto.getAirportCode());
        tmp.setStatus(airportDto.getStatus());
        tmp.setLocationId(airportDto.getLocationId());
        return tmp;
    }
}
