package com.example.ormpractice.service;

import com.example.ormpractice.dto.RoleDto;

import java.util.List;

public interface IRoleService {
    RoleDto getRoleById(int id);
    List<RoleDto> getAll();
}
