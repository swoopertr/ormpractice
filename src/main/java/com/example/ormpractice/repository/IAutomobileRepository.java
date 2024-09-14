package com.example.ormpractice.repository;

import com.example.ormpractice.entity.Automobile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAutomobileRepository extends JpaRepository<Automobile, Integer> {
    
}
