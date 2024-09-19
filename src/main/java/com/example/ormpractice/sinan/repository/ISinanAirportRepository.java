package com.example.ormpractice.sinan.repository;

import com.example.ormpractice.sinan.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISinanAirportRepository extends JpaRepository<Airport, Integer> {

}
