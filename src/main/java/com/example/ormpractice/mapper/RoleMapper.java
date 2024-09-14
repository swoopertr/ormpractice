package com.example.ormpractice.mapper;

import com.example.ormpractice.dto.RoleDto;
import com.example.ormpractice.entity.Role;

public class RoleMapper {
    public static RoleDto RoleToRoleDto(Role role){
        return new RoleDto(role.getRole(), role.getType());
    }
}
