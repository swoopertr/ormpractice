package com.example.ormpractice.controller;

import com.example.ormpractice.dto.ElifDto;
import com.example.ormpractice.service.IElifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api/elif")
public class ElifController {

    @Autowired
    private IElifService elifService;

    @GetMapping({"","/"})
    public String ok(){
        return "ok";
    }

    @GetMapping("/{id}")
    public ElifDto getById(@PathVariable int id){
        ElifDto elifDto = elifService.getElifById(id);
        return elifDto;
    }
    @GetMapping("/list")
    public List<ElifDto> getAll(){
        List<ElifDto> elifDtos = elifService.getAll();
        return elifDtos;
    }
}
