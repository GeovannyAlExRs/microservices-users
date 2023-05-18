package com.company.dtk.microservicesusers.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name="users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", unique = true, nullable = false, length = 100)
    private  String username;

    @Column(name = "password", nullable = false)
    private  String password;

    @Column(name = "name", nullable = false)
    private  String name;

    @Column(name = "address", nullable = false)
    private  String address;

    @Column(name = "date", nullable = false)
    private LocalDateTime date;

}
