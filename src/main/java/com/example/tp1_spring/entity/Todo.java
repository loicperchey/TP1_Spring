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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }
}
