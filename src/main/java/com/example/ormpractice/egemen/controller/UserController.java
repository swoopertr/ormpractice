package com.example.ormpractice.egemen.controller;

import com.example.ormpractice.egemen.dto.UserDto;
import com.example.ormpractice.egemen.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/egemen/user")
public class UserController {

    @Autowired
    @Qualifier("EgoUserComponenet")
    IUserService userService;


    @GetMapping({"","/"})
    public String homePageCheckker(){
        return "Akıyore";
    }


    @GetMapping("/{id}")
    public UserDto getById(@PathVariable int id){
        return userService.getUserById(id);
    }

    @GetMapping("/all")
    public List<UserDto> getAll(){
        return  userService.getAllUsers();
    }

    @PutMapping("/{id}")
    public UserDto updateUser(@PathVariable int id, @RequestBody UserDto userDto) {
        return userService.updateUserById(id, userDto);
    }

    @PostMapping("/")
    public UserDto createUser(@RequestBody UserDto userDto) {
        return userService.createUser(userDto);
    }
}
