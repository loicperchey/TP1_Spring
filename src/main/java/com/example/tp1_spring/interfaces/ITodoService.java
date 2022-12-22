package com.example.tp1_spring.interfaces;

import java.util.List;

public interface ITodoService<T> {
//Préparer l'interface pour les bases du CRUD demandé
    boolean create (T s);

    boolean update (T s);

    boolean delete (T s);

    T findById (int id);

    List<T> findAll();

}
