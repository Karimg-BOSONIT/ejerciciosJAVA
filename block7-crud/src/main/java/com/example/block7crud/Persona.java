package com.example.block7crud;

import lombok.Data;

@Data
public class Persona {

    String name;
    int age;

    String town;
    int id;

    public Persona(String name, int age, String town, int id){
        this.name = name;
        this.age = age;
        this.town = town;
        this.id = id;
    }

}
