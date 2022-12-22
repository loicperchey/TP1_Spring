package com.example.tp1_spring.service;

import com.example.tp1_spring.entity.Todo;
import com.example.tp1_spring.interfaces.ITodoService;
import com.example.tp1_spring.tools.ServiceHibernate;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;
//1-établissement des bases du métier
@Service
public class TodoService implements ITodoService<Todo> {
//usage des bases tirées d'hibernate avec les sessions et autres
    private ServiceHibernate serviceHibernate;

    private Session session;

    public TodoService(ServiceHibernate serviceHibernate){
        this.serviceHibernate = serviceHibernate;
        session = this.serviceHibernate.getSession();
    }


    @Override
    public boolean create(Todo s) {
        session.beginTransaction();
        session.persist(s);
        session.getTransaction().commit();
        return true;
    }

   @Override
    public boolean delete(Todo s) {

        return false;
    }

    @Override
    public boolean update(Todo s) {
        session.beginTransaction();
        session.update(s);
        session.getTransaction().commit();
        return false;
    }



    @Override
    public Todo findById(int id) {
        Todo produit = null;
        produit = (Todo) session.get(Todo.class,id);
        return produit;
    }

    @Override
    public List<Todo> findAll() {

        Query<Todo> produitQuery = session.createQuery("from Todo", Todo.class);
        return produitQuery.list();
    }

}
