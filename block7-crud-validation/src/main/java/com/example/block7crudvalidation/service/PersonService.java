package com.example.block7crudvalidation.service;



import com.example.block7crudvalidation.entity.Person;

import java.util.ArrayList;
import java.util.List;

//Interface que contiene los metodos de logica de negocio para las Personas
public interface PersonService {
    void save(Person person);

    Person findById(Long id);

    List<Person> findByUser(String user);

    List<Person> findAll();


}
