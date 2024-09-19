package com.example.ormpractice.egemen.service.Implemnt;

import com.example.ormpractice.egemen.dto.UserDto;
import com.example.ormpractice.egemen.entity.User;
import com.example.ormpractice.egemen.mapper.UserMapper;
import com.example.ormpractice.egemen.repository.IUserRepository;
import com.example.ormpractice.egemen.service.IUserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Component("EgoUserComponenet")
public class UserServiceImplmnt implements IUserService {

    private IUserRepository userRepository;


    @Override
    public UserDto getUserById(int Id){
        User result = userRepository.getById(Id);
        UserDto userdto = UserMapper.User2UserDto(result);
        return userdto;
    }

    @Override
    public List<UserDto> getAllUsers(){
        List<User> users = userRepository.findAll();
        List<UserDto> userDtos = new ArrayList<>();

        for (int i = 0; i<users.size(); i++){
            UserDto tmpDto = UserMapper.User2UserDto(users.get(i));
            userDtos.add(tmpDto);
        }

        return userDtos;
    }


    @Override
    public UserDto updateUserById(int id, UserDto userDto) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));

        user.setUsername(userDto.getUsername());
        user.setEmail(userDto.getEmail());

        User updatedUser = userRepository.save(user);

        return UserMapper.User2UserDto(updatedUser);
    }

    @Override
    public UserDto createUser(UserDto userDto) {

        User newUser = new User();
        newUser.setUsername(userDto.getUsername());
        newUser.setEmail(userDto.getEmail());


        User savedUser = userRepository.save(newUser);


        return UserMapper.User2UserDto(savedUser);
    }


    @Override
    public void deleteUserById(int id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));

        user.setIsdeleted(true);
        // userRepository.delete(user);
    }


}
