package com.example.ormpractice.service;

import com.example.ormpractice.dto.UserDto;

import java.util.List;


public interface IUserService {
    UserDto getUserbyId(int id);
    List<UserDto> getAllUsers();
}
