package com.example.ormpractice.egemen.repository;

import com.example.ormpractice.egemen.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Integer> {
}
