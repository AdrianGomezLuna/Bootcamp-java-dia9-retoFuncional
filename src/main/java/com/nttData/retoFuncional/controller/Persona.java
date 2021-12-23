package com.nttData.retoFuncional.controller;

import java.util.HashMap;

public class Persona {
	
	private String name;
	
	private String user;
	
	private String password;
	
	public Persona() { }

	public Persona(String name, String user, String password) {
		this.name = name;
		this.user = user;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	/*public HashMap<String, String> toParams() {
		var mapa = new HashMap<String, String[]>();
		mapa.put(this.user, new String[] {this.name,this.user,this.password});
		return mapa;
	}*/

}
