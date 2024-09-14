package com.example.ormpractice.repository;

import com.example.ormpractice.entity.ElifEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IElifRepository extends JpaRepository<ElifEntity, Integer> {
}
