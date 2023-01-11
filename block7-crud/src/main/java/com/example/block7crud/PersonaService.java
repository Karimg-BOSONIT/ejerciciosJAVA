package com.example.block7crud;

import java.util.List;

public interface PersonaService {
/*
La interfaz define los métodos:
save para guardar una persona,
update para actualizar una persona dado su id,
delete para borrar una persona dado su id,
findById para buscar una persona dado su id,
findByName para buscar una lista de persona por nombre y
findAll para buscar todas las personas.
*/
    void save(Persona persona);

    void update(Long id, Persona persona);

    void delete(Long id);

    Persona findById(Long id);

    List<Persona> findByName(String nombre);

    List<Persona> findAll();

}
