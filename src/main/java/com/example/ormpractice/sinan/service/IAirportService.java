package com.example.ormpractice.sinan.service;

import com.example.ormpractice.sinan.dto.AirportDto;
import com.example.ormpractice.sinan.entity.Airport;

import java.util.List;

public interface IAirportService {

    AirportDto getAirportById(int id);
    List<AirportDto> getAllAirports();
    AirportDto addNewAirPort(AirportDto airportDto);
}
