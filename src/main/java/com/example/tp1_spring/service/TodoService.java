package com.example.tp1_spring.service;

import com.example.tp1_spring.interfaces.ITodoService;
import org.springframework.stereotype.Service;

import java.util.List;
//1-établissement des bases du métier
@Service
public class TodoService implements ITodoService {
    @Override
    public boolean create(Object s) {
        return false;
    }

    @Override
    public boolean update(Object s) {
        return false;
    }

    @Override
    public boolean delete(Object s) {
        return false;
    }

    @Override
    public Object findById(int id) {
        return null;
    }

    @Override
    public List findAll() {
        return null;
    }
}
