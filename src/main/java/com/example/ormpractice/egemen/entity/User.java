package com.example.ormpractice.egemen.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "User", schema = "Egemen")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String username;

    private String email;

    @Column(name="passwordhash")
    private int password;

    private int roleid;

    private int subscriptionid;

    private Date createdat;

    private Date lastmodifiedat;

    private String status;

    private boolean isdeleted;


}
