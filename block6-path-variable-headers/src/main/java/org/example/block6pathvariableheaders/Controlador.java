package org.example.block6pathvariableheaders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@RestController
public class Controlador {
    @Autowired
    Servicio servicio;

    //Post un user
    @PostMapping("/user")
    public Persona addPersona(@RequestBody Persona info){
        return servicio.addPersona(info);
    }

    //Conseguir la id de un user
    @GetMapping("/user/{id}")
    public int showId(@PathVariable int id){
        return id;
    }

    //Actualizar variables
    @PutMapping("/post")
    public HashMap getVar(@RequestParam(name= "var1") String var1,
                              @RequestParam(name= "var2") String var2){
        return servicio.addVar(var1, var2);
    }

}
