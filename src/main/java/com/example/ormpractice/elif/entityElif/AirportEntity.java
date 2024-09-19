package com.example.ormpractice.elif.entityElif;

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

@Table(name="Airports")
public class AirportEntity {

    @Column(name = "AirportName" )
    private String AirportName ;

    @Column(name = "AirportCode")
    private int AirportCode ;

    @Column(name = "LocationId")
    private int LocationId ;

    @Column(name = "IsDeleted")
    private int IsDeleted ;

    @Id
    @Column(name = "AirportId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
}
