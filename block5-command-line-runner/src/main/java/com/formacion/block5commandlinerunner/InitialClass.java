package com.formacion.block5commandlinerunner;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class InitialClass {
    @PostConstruct
    public void init(){
        System.out.println("Hola desde clase inicial");
    }
}
