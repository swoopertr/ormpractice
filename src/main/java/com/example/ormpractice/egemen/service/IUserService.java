package com.example.ormpractice.egemen.service;


import com.example.ormpractice.egemen.dto.UserDto;

import java.util.List;

public interface IUserService {
    UserDto getUserById(int id);
    List<UserDto> getAllUsers();
    UserDto updateUserById(int id, UserDto userDto);
    UserDto createUser(UserDto userDto);
    void deleteUserById(int id);
}
