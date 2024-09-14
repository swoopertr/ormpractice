package com.example.ormpractice.mapper;

import com.example.ormpractice.dto.UserDto;
import com.example.ormpractice.entity.User;

public class UserMapper {
    public static UserDto UserToUserDto(User user){
       return new UserDto(user.getUsername(), user.getEmail());
    }
}
