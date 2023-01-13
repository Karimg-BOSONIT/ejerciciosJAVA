package com.example.block7crudvalidation.repository;
import java.util.Optional;
import com.example.block7crudvalidation.entity.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.yaml.snakeyaml.events.Event;

//Interface que contiene el crud de JPA para la tabla Person
public interface PersonRepository extends CrudRepository<Person, Integer> {

}
