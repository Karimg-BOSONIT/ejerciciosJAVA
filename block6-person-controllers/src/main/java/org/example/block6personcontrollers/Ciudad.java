package org.example.block6personcontrollers;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Ciudad {

    private String nombre;
    private int numeroHabitantes;

    public Ciudad(String nombre, int numeroHabitantes){

        this.nombre = nombre;
        this.numeroHabitantes = numeroHabitantes;
    }
}
