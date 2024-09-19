package com.example.ormpractice.elif.repository;

import com.example.ormpractice.elif.entityElif.AirportEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAirportRepository extends JpaRepository <AirportEntity,Integer> {
}
