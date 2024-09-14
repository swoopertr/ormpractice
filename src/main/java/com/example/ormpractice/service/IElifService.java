package com.example.ormpractice.service;

import com.example.ormpractice.dto.ElifDto;
import com.example.ormpractice.entity.ElifEntity;

import java.util.List;

public interface IElifService {
    ElifDto getElifById(int id);
    List<ElifDto> getAll();
}
