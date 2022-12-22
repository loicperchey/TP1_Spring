package com.example.tp1_spring.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
//l'entité qui servira de base
@Entity
@Data
public class Todo {
    @Id
    @GeneratedValue
    private int id;

    private String titre;

    private String description;
    @Temporal(TemporalType.DATE)
    private Date date;


    private boolean etat;


}
