package com.example.ormpractice.service.impl;

import com.example.ormpractice.dto.AutomobileDto;
import com.example.ormpractice.entity.Automobile;
import com.example.ormpractice.mapper.AutomobileMapper;
import com.example.ormpractice.repository.IAutomobileRepository;
import com.example.ormpractice.service.IAutomobileService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
@Component
public class AutomobileServiceImpl implements IAutomobileService {

    private IAutomobileRepository iAutomobileRepository;

    public List<AutomobileDto> getAutomobiles() {
        List<Automobile> automobiles = iAutomobileRepository.findAll();
        List<AutomobileDto> automobileDtoList = new ArrayList<>();
        for (int i = 0; i < automobiles.size(); i++) {
            AutomobileDto tmpAuto = AutomobileMapper.AutomobileDtoMapper(automobiles.get(i));
            automobileDtoList.add(tmpAuto);
        }
        return automobileDtoList;
    }

    public AutomobileDto getAutomobileById(int id){
        Automobile automobile = iAutomobileRepository.getById(id);
        return AutomobileMapper.AutomobileDtoMapper(automobile);
    }
}
