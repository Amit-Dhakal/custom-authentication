package com.example.CustomDBAuthentication.model;

import jakarta.persistence.*;
import lombok.Data;

@Table(name="ROLES")
@Entity
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;


}
