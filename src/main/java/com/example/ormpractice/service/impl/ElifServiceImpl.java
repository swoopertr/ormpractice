package com.example.ormpractice.service.impl;

import com.example.ormpractice.dto.ElifDto;
import com.example.ormpractice.entity.ElifEntity;
import com.example.ormpractice.mapper.ElifMapper;
import com.example.ormpractice.repository.IElifRepository;
import com.example.ormpractice.service.IElifService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Component
public class ElifServiceImpl implements IElifService {
    private IElifRepository elifRepository;

    @Override
    public ElifDto getElifById(int id) {
        ElifEntity elifEntity = elifRepository.getById(id);
        ElifDto elifDto = ElifMapper.ElifToElifDto(elifEntity);
        return elifDto;
    }

    @Override
    public List<ElifDto> getAll() {
        List<ElifEntity> elifEntities = elifRepository.findAll();
        List<ElifDto> result = new ArrayList<>();
        for (int i = 0; i < elifEntities.size(); i++) {
            result.add(ElifMapper.ElifToElifDto(elifEntities.get(i)))
        }

        return List.of();
    }
}
