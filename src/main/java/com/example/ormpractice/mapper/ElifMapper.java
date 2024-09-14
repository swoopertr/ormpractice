package com.example.ormpractice.mapper;

import com.example.ormpractice.dto.ElifDto;
import com.example.ormpractice.entity.ElifEntity;

public class ElifMapper {
    public static ElifDto ElifToElifDto(ElifEntity elifEntity) {
        return new ElifDto(elifEntity.getName());
    }
}
