package com.formacion.block5commandlinerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ThirdClass implements CommandLineRunner {

    public String Uno(){ //String uno para pasar como parametro
        return "Soy la";
    }
    public String Dos(){ //String dos para pasar como parametro
        return " tercera clase";
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(Uno() + Dos()); //Paso como parametro las strings al print de la funcion run
    }
}
