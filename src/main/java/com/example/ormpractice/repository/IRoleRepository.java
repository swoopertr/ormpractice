package com.example.ormpractice.repository;

import com.example.ormpractice.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<Role, Integer> {
}
