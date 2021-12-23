package com.nttData.retoFuncional.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class personaController {		
	
	//Base de datos
	private List<Persona> listUsuarios = new ArrayList<Persona>();

	public personaController() {
		listUsuarios.add(new Persona("Adri", "adri", "1234"));
		listUsuarios.add(new Persona("Ivan", "ivan", "1234"));
		listUsuarios.add(new Persona("Ana", "ana", "1234"));
	}
	
	@GetMapping(path="/login")
	public String login(String user, String pass) {
		var res = listUsuarios.stream().filter( p -> (p.getUser() == user && p.getPassword() == pass));
		if (res.count()==1) return "¡Hola!! " + user; 
		else return "Usario o contraseña erroneos"; 		
	}

}
