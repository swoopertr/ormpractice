package com.example.ormpractice.sinan.service.impl;


import com.example.ormpractice.sinan.dto.AirportDto;
import com.example.ormpractice.sinan.entity.Airport;
import com.example.ormpractice.sinan.mapper.AirportMapper;
import com.example.ormpractice.sinan.repository.ISinanAirportRepository;
import com.example.ormpractice.sinan.service.IAirportService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Component("sinanAirport")
public class AirportServiceImpl implements IAirportService {
    private ISinanAirportRepository iSinanAirportRepository;
    public AirportDto getAirportById(int id) {

        Airport result = iSinanAirportRepository.getById(id);
        return AirportMapper.EntityToDto(result);

    }

    public List<AirportDto> getAllAirports() {
        List<Airport> result = iSinanAirportRepository.findAll();
        List<AirportDto> allAirports = new ArrayList<>();
        for (int i = 0; i < result.size(); i++) {
            AirportDto tmpAirportDto = AirportMapper.EntityToDto(result.get(i));
            allAirports.add(tmpAirportDto);
        }
        return allAirports;
    }

    public AirportDto addNewAirPort(AirportDto airportDto) {

        Airport createdAirport = AirportMapper.AirportDtoToAriportEntity(airportDto);
        Airport save = iSinanAirportRepository.save(createdAirport);

        return AirportMapper.EntityToDto(save);
    }
}
