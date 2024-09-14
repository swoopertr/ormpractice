package com.example.ormpractice.service;

import com.example.ormpractice.dto.AutomobileDto;
import com.example.ormpractice.entity.Automobile;

import java.util.List;

public interface IAutomobileService {
    List<AutomobileDto> getAutomobiles();

    AutomobileDto getAutomobileById(int id);
}
