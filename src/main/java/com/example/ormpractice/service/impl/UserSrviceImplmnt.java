package com.example.ormpractice.service.impl;

import com.example.ormpractice.dto.RoleDto;
import com.example.ormpractice.dto.UserDto;
import com.example.ormpractice.entity.User;
import com.example.ormpractice.mapper.UserMapper;
import com.example.ormpractice.repository.IUserRepository;
import com.example.ormpractice.service.IUserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Component
public class UserSrviceImplmnt implements IUserService {

private IUserRepository userRepository;
    @Override
    public UserDto getUserbyId(int id){

    User result = userRepository.getById(id);
    // UserDto dto = new UserDto(result.getUsername(), result.getEmail());
    UserDto dto = UserMapper.UserToUserDto(result);
    return dto;
    }


    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        List<UserDto> userDtos = new ArrayList<>();

        for (int i = 0; i<users.size(); i++){
            UserDto tmpDto = UserMapper.UserToUserDto(users.get(i));
            userDtos.add(tmpDto);
        }
        return userDtos;
    }

    public void ali(){

    }
}
