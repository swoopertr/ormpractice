package com.example.ormpractice.sinan.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Airports" , schema="sinan_air_company")
public class Airport {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "AirportName")
    private String AirportName;
    @Column(name = "AirportCode")
    private String AirportCode;
    @Column(name = "LocationId", nullable = true)
    private Integer LocationId;
    @Column(name = "Status")
    private String Status;
    @Column(name = "IsDeleted", nullable = true)
    private Boolean IsDeleted;
    @Column(name = "CreatedAt")
    private Date CreatedAt;
    @Column(name = "LastModifiedAt")
    private Date LastModifiedAt;
}
