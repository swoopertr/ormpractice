package com.example.ormpractice.gultekin.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Airports" , schema="nebiAirCompany")
public class GultekinAirportEntity {

    @Id
    @Column(name = "AirportId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int AirportId;

    @Column(name = "AirPortName")
    private String AirPortName;

    @Column(name = "AirPortCode")
    private String AirPortCode;

    @Column(name = "LocationID")
    private int LocationID;

}