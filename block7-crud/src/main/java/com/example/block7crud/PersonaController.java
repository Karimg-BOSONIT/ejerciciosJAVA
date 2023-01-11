package com.example.block7crud;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @PostMapping //OK
    public ResponseEntity<Void> save(@RequestBody Persona persona) {
        personaService.save(persona);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{id}") //OK
    public ResponseEntity<Void> update(@PathVariable("id") Long id, @RequestBody Persona persona) {
        personaService.update(id, persona);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}") //OK
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        personaService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}") //OK
    public ResponseEntity<Persona> findById(@PathVariable("id") Long id) {
        Persona persona = personaService.findById(id);
        if (persona != null) {
            return new ResponseEntity<>(persona, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/nombre/{nombre}") //OK
    public ResponseEntity<List<Persona>> findByName(@PathVariable("nombre") String nombre) {
        List<Persona> personas = personaService.findByName(nombre);
        return new ResponseEntity<>(personas, HttpStatus.OK);
    }

    @GetMapping //OK
    public ResponseEntity<List<Persona>> findAll() {
        List<Persona> personas = personaService.findAll();
        return new ResponseEntity<>(personas, HttpStatus.OK);
    }

    @ExceptionHandler(Exception.class) //No seguro si funciona
    public ResponseEntity<Void> handleException(Exception e) {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}