package com.example.hibernate.controller;

import com.example.hibernate.model.Person;
import com.example.hibernate.repository.RepositoryHibernate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerHibernate {

    private final RepositoryHibernate repositoryHibernate;

    public ControllerHibernate(RepositoryHibernate repositoryHibernate) {
        this.repositoryHibernate = repositoryHibernate;
    }


    @GetMapping("/persons/by-city")
    public List<Person> byCiry(@RequestParam String city){
        return  repositoryHibernate.getPersonsByCity(city);
    }
}
