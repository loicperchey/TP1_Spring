package com.example.tp1_spring.tools;
//préparer la gestion des sessions (Hibernate doit aussi nous rendre service)
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

@Service
public class ServiceHibernate {

    private Session _session;

    public ServiceHibernate() {
        try {
            _session = HibernateUtil.getSessionFactory().openSession();
        }catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }

    public Session getSession() {return HibernateUtil.getSessionFactory().openSession();}

}


