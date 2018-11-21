package com.castillo;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class AlumnoController {

	private String nombre;
	private String apellido;
	private String edad;
	private String email;
	
	
	public void guardar() {
		
		
		System.out.println("Recibiendo datos:");
		
		System.out.println("--> " + nombre);
		System.out.println("--> " + apellido);
		System.out.println("--> " + edad);
		System.out.println("--> " + email);
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
