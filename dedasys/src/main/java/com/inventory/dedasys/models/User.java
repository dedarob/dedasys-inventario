package com.inventory.dedasys.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_users")
    private Integer id;
    @Column(name = "name_users")
    private String name;
    @Column(name = "password_users")
    private String password;
    @Column(name = "privilege_users")
    private char privilege;
}
