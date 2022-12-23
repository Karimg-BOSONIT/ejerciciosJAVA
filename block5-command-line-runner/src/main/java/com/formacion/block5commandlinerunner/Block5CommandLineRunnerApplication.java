package com.formacion.block5commandlinerunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Block5CommandLineRunnerApplication {

	/* @Autowired // @Autowired es para inyectar una instancia de un bean
	private InitialClass initialClass;

	@Autowired
	private SecondaryClass secondaryClass;

	@Autowired
	private ThirdClass thirdClass; */

	public static void main(String[] args) {
		SpringApplication.run(Block5CommandLineRunnerApplication.class, args);
	}
}
