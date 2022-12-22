package com.example.tp1_spring.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Todo {
    @Id
    @GeneratedValue
    private int id;

    private String titre;
    @Temporal(TemporalType.DATE)
    private Date date;

    private boolean etat;
}
