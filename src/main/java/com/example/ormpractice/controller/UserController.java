package com.example.ormpractice.controller;

import com.example.ormpractice.dto.UserDto;
import com.example.ormpractice.entity.User;
import com.example.ormpractice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;
import java.util.List;

@RequestMapping("/v1/api/user")
@RestController
public class UserController {

    @Autowired
    IUserService userService;

    @GetMapping({"","/"})
    public String homepage(){
        return "User Akıyo :)";
    }

    @GetMapping("/{id}")
    public UserDto getById(@PathVariable int id){
        return userService.getUserbyId(id);
    }

    @GetMapping("/all")
    public List<UserDto> getAll(){
        return  userService.getAllUsers();
    }
}
