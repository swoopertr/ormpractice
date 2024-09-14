package com.example.ormpractice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="eliftable")
public class ElifEntity {

    @Column(name = "namedeneme" )
    private String name;

    @Column(name = "agedeneme")
    private int age;

    @Column(name = "citydeneme")
    private String cityDeneme;

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
}
