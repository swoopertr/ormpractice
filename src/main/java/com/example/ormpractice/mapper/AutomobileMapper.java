package com.example.ormpractice.mapper;

import com.example.ormpractice.dto.AutomobileDto;
import com.example.ormpractice.entity.Automobile;

import java.util.List;

public class AutomobileMapper {

    public static AutomobileDto AutomobileDtoMapper(Automobile automobile) {
        return new AutomobileDto(automobile.getBrand(),automobile.getModel());
    }
}
