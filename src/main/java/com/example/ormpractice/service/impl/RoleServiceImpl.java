package com.example.ormpractice.service.impl;

import com.example.ormpractice.dto.RoleDto;
import com.example.ormpractice.entity.Role;
import com.example.ormpractice.mapper.RoleMapper;
import com.example.ormpractice.repository.IRoleRepository;
import com.example.ormpractice.service.IRoleService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Component
public class RoleServiceImpl implements IRoleService {

    private IRoleRepository roleRepository;

    @Override
    public RoleDto getRoleById(int id) {
        Role role =  roleRepository.getById(id);
        RoleDto roleDto = RoleMapper.RoleToRoleDto(role);
        return roleDto;
    }

    @Override
    public List<RoleDto> getAll() {
        List<Role> roles = roleRepository.findAll();
        List<RoleDto> result = new ArrayList<>();
        for (int i = 0; i < roles.size(); i++) {
            result.add(RoleMapper.RoleToRoleDto(roles.get(i)));
        }
        return result;
    }

}
