package com.cenepred.appcnp.dto.model;

public class StudentDTO {
	private String id;
	private String nombre;
	private String apellido;
	private int edad;
	private long codigoStudent;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public long getCodigoStudent() {
		return codigoStudent;
	}
	public void setCodigoStudent(long codigoStudent) {
		this.codigoStudent = codigoStudent;
	}
	
	
}
