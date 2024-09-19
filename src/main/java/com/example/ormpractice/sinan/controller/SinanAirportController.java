package com.example.ormpractice.sinan.controller;

import com.example.ormpractice.sinan.dto.AirportDto;
import com.example.ormpractice.sinan.entity.Airport;
import com.example.ormpractice.sinan.service.IAirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/sinan/airport")
public class SinanAirportController {

    @Autowired
    @Qualifier("sinanAirport")
    private IAirportService iAirportService;

    @GetMapping({"", "/"})
    public String testConnection() {
        return "ok";
    }

    @GetMapping("/{id}")
    public AirportDto getAirportById(@PathVariable int id) {
        return iAirportService.getAirportById(id);
    }

    @GetMapping("/all")
    public List<AirportDto> getAllAirports() {
        return iAirportService.getAllAirports();
    }

    @PostMapping("/")
    public AirportDto addNewAirport(@RequestBody AirportDto airportDto ) {
        return iAirportService.addNewAirPort(airportDto);
    }
}
