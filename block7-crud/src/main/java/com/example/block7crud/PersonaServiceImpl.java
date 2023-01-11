package com.example.block7crud;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements PersonaService {

    //Lista "personas" para guardarlas
    private List<Persona> personas = new ArrayList<>();

    //Añade la persona obtenida en la lista personas
    @Override
    public void save(Persona persona) {
        personas.add(persona);
    }

    //Hace un for en la lista personas en busca de la persona con la id igual que la id proporcionada
    //obtiene los datos de persona
    @Override
    public void update(Long id, Persona persona) {
        for (Persona p : personas) {
            if (p.getId() == id) {
                p.setName(persona.getName());
                p.setAge(persona.getAge());
                p.setTown(persona.getTown());
                break;
            }
        }
    }

    //Borra de la lista de personas la persona con la misma id que la proporcionada
    @Override
    public void delete(Long id) {
        personas.removeIf(p -> p.getId() == id);
    }

    //Hace un loop en la lista personas en busca de la persona con la misma id que la proporcionada y la retorna
    //retorna null sino la encuentra
    @Override
    public Persona findById(Long id) {
        for (Persona p : personas) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    //busca con un loop en la lista personas a la persona con el mismo nombre que el proporcionado
    // lo añade a una nueva lista "result" y la devuelve
    @Override
    public List<Persona> findByName(String name) {
        List<Persona> result = new ArrayList<>();
        for (Persona p : personas) {
            if (p.getName().equalsIgnoreCase(name)) {
                result.add(p);
            }
        }
        return result;
    }

    //retorna la lista "personas"
    @Override
    public List<Persona> findAll() {
        return personas;
    }
}
