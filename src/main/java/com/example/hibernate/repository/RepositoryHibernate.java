package com.example.hibernate.repository;

import com.example.hibernate.model.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositoryHibernate {
   @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonsByCity(String city){
        return entityManager.createQuery("from Person p where p.cityOfLiving = :city",Person.class).setParameter("city", city).getResultList();
    }



}
