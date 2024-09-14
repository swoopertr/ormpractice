package com.example.ormpractice.controller;

import com.example.ormpractice.dto.AutomobileDto;
import com.example.ormpractice.entity.Automobile;
import com.example.ormpractice.mapper.AutomobileMapper;
import com.example.ormpractice.service.IAutomobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api/automobile")
public class AutomobileController {

    @Autowired
    private IAutomobileService iAutomobileService;

    @GetMapping({"", "/"})
    public  String testConnection(){
        return "ok";
    }

    @GetMapping("/{id}")
    public AutomobileDto getById(@PathVariable int id){

        return iAutomobileService.getAutomobileById(id);
    }

    @GetMapping("/all")
    public List<AutomobileDto> getAll(){

        return iAutomobileService.getAutomobiles();
    }

}
