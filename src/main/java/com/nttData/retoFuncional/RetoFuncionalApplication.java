package com.nttData.retoFuncional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttData.retoFuncional.controller.personaController;

@SpringBootApplication
public class RetoFuncionalApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(RetoFuncionalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		personaController p = new personaController();
		
		//Usuario error
		System.err.println(p.login("Adri", "1234"));
		//Usuario correcto
		System.err.println(p.login("adri", "1234"));
		
	}

}
