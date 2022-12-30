package org.example.block6personcontrollers;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/controlador1")
public class Controlador1 {
    private final Servicio servicio;

    public Controlador1(Servicio servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/addPersona")
    public Persona addPersona(@RequestHeader("nombre") String nombre,
                              @RequestHeader("poblacion") String poblacion,
                              @RequestHeader("edad") int edad) {
        return servicio.crearPersona(nombre, poblacion, edad);
    }

    @PostMapping("/addCiudad")
    public void addCiudad(@RequestBody Ciudad ciudad) {
        servicio.addCiudad(ciudad);
    }


}
