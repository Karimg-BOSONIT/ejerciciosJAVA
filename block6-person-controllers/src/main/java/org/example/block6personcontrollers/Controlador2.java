package org.example.block6personcontrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/controlador2")
public class Controlador2 {
    private final Servicio servicio;

    public Controlador2(Servicio servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/getPersona")
    public Persona getPersona() {
        Persona persona = servicio.obtenerPersona();
        persona.setEdad(persona.getEdad() * 2);
        return persona;
    }

    //List<Ciudad> ciudades = new ArrayList<Ciudad>();
    @GetMapping("/getCiudad")
    public List<Ciudad> getCiudad() {
        return servicio.getCiudad();
    }
}
