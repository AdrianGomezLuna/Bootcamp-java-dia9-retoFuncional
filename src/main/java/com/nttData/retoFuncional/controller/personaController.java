package com.nttData.retoFuncional.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	
	//Para hacer la búsqueda 
	//http://localhost:8080/login?user=adri&password=1234 
	@GetMapping(path="/login")
	public String login(@RequestParam(value = "user") String user, @RequestParam(value = "password") String pass) {
		var res = listUsuarios.stream().filter( p -> (p.getUser().equals(user) && p.getPassword().equals(pass)));
		return (res.count()==1)? "¡Hola!! " + user : "Usario o contraseña erroneos";
	}

}
