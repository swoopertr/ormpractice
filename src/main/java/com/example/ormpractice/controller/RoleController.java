package com.example.ormpractice.controller;

import com.example.ormpractice.dto.RoleDto;
import com.example.ormpractice.entity.Role;
import com.example.ormpractice.mapper.RoleMapper;
import com.example.ormpractice.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api/roles")
public class RoleController {

    @Autowired
    private IRoleService roleService;

    @GetMapping({"","/"})
    public String ok(){
        return "ok";
    }

    @GetMapping("/{id}")
    public RoleDto getById(@PathVariable int id){
        RoleDto roleDto = roleService.getRoleById(id);
        return roleDto;
    }

    @GetMapping("/all")
    public List<RoleDto>  getAll(){
        List<RoleDto> roleDtos = roleService.getAll();
        return roleDtos;
    }

}
