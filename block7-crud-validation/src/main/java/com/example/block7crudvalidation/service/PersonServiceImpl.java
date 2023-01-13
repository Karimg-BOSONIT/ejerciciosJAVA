package com.example.block7crudvalidation.service;

import com.example.block7crudvalidation.entity.Person;
import com.example.block7crudvalidation.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//Clase que implementa los metodos de logica de negocio de la interfaz de PersonService
@Service
public class PersonServiceImpl implements PersonService {

    private List<Person> persons = new ArrayList<>();
    @Autowired
    private PersonRepository personRepository;


    //Retorna una lista con todas las personas
    @Override
    public List<Person> findAll(){
        return persons;
    }

    //Añade la persona obtenida en la lista personas
    @Override
    public void save(Person person) {
        persons.add(person);
    }

    //Hace un loop en la lista personas en busca de la persona con la misma id que la proporcionada y la retorna
    //retorna null sino la encuentra
    @Override
    public Person findById(Long id) {
        for (Person p : persons) {
            if (p.getId_person() == id) {
                return p;
            }
        }
        return null;
    }

    //busca con un loop en la lista persons a la person con el mismo nombre que el proporcionado
    // lo añade a una nueva lista "result" y la devuelve
    @Override
    public List<Person> findByUser(String user) {
        List<Person> result = new ArrayList<>();
        for (Person p : persons) {
            if (p.getUser().equalsIgnoreCase(user)) {
                result.add(p);
            }
        }
        return result;
    }

}
