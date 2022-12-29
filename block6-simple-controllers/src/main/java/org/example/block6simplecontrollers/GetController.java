package org.example.block6simplecontrollers;

import org.springframework.web.bind.annotation.*;

@RestController
public class GetController {

    @GetMapping(value= "/user/{nombre}")
    public String hola(@PathVariable String nombre){
        return "Hola " + nombre;
    }

    @PostMapping("/useradd")
    public Person person (@RequestBody Person data){ //Se recibe la info
        Person person1 = data; // Guarda la info en person1
        person1.setAge(person1.getAge() + 1); //setea la edad de nuevo añadiendole 1 en person1
        return person1; //devuelve person1
    }

    //NOTA: No olvidar especificar headers en postman "Content-Type" application/json  para que reciba el post
}
