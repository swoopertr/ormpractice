package com.example.ormpractice.repository;

import com.example.ormpractice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Integer> {
}
