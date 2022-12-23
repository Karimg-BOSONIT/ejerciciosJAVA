package org.example.block5properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Block5PropertiesApplication {
	public static void main(String[] args) {
		System.setProperty("new.property", "new.property no tiene valor");
		SpringApplication.run(Block5PropertiesApplication.class, args);
	}
	@Component
	public class Componente implements CommandLineRunner{

		@Value("${greeting}") private String nombre;
		@Value("${my.number}") private String numero;
		@Value("${new.property}") private String newProperty;



		@Override public void run(String... args) throws Exception {
			System.out.println("El valor de greeting es: " + nombre);
			System.out.println("El valor de myNumber es: " + numero);
			System.out.println("El valor de new.property es: " + newProperty);
		}
	}
}
