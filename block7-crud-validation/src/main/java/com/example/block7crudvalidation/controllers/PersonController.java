package com.example.block7crudvalidation.controllers;

import com.example.block7crudvalidation.entity.Person;
import com.example.block7crudvalidation.service.PersonService;
import com.example.block7crudvalidation.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class PersonController {

    @Autowired //Servicio inyectable
    private PersonService personService;
    @GetMapping //Retorna una lista con todos los usuarios
    public ResponseEntity<List<Person>> findAll() {
        List<Person> users = personService.findAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
    @PostMapping //Guarda a un user en la lista
    public ResponseEntity<String> save(@RequestBody Person person) {
        personService.save(person);
        return new ResponseEntity<>(HttpStatus.CREATED + " Persona ha sido creada", HttpStatus.CREATED);
    }

    class ErrorResponse{
        private String message;
        public ErrorResponse(String message){
            this.message = message;
        }
        public String getMessage() {
            return message;
        }
        public void setMessage(String message) {
            this.message = message;
        }
    }
    @GetMapping("/{id}") //Retorna al usuario filtrado por la id especificada
    public ResponseEntity<Person> findById(@PathVariable("id") Long id) {
        Person person = personService.findById(id);
        if (person != null) {
            return new ResponseEntity<>(person, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
