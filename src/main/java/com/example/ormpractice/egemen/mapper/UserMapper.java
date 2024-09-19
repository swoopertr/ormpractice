package com.example.ormpractice.egemen.mapper;

import com.example.ormpractice.egemen.dto.UserDto;
import com.example.ormpractice.egemen.entity.User;

public class UserMapper {
    public static UserDto User2UserDto(User _user){
        return new UserDto(_user.getUsername(), _user.getEmail());
    }
}
