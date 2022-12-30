package org.example.block6personcontrollers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguracionPersona {
    @Bean("bean1")
    public Persona bean1() {
        String nombre = "Karim1";
        int edad = 29;
        String poblacion = "Cadiz";

        return new Persona(nombre,poblacion,edad);
    }
    @Bean("bean2")
    public Persona bean2() {
        String nombre = "Karim2";
        int edad = 30;
        String poblacion = "Sevilla";

        return new Persona(nombre,poblacion,edad);
    }
    @Bean("bean3")
    public Persona bean3() {
        String nombre = "Karim3";
        int edad = 31;
        String poblacion = "Asturias";

        return new Persona(nombre,poblacion,edad);
    }
}
