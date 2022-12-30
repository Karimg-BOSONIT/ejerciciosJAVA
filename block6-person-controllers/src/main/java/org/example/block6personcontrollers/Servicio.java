package org.example.block6personcontrollers;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class Servicio {
    private Persona persona;

    public Persona crearPersona(String nombre, String poblacion, int edad) {
        persona = new Persona(nombre, poblacion, edad);
        return persona;
    }

    public Persona obtenerPersona() {
        return persona;
    }

    List<Ciudad> ciudades;
    public Servicio() {
        this.ciudades = new ArrayList<Ciudad>();
    }

    public void addCiudad(Ciudad ciudad) {
        ciudades.add(ciudad);
    }
    public List<Ciudad> getCiudad() {
        return ciudades;
    }

}


