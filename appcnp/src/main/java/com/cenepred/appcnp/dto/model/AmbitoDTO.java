package com.cenepred.appcnp.dto.model;

import com.vividsolutions.jts.geom.Geometry;

public class AmbitoDTO {
	  private long id ;
	  private String ubigeo ;
	  private String  nombre ;
	  private String descripcion;
	  private Geometry shape;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUbigeo() {
		return ubigeo;
	}
	public void setUbigeo(String ubigeo) {
		this.ubigeo = ubigeo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Geometry getShape() {
		return shape;
	}
	public void setShape(Geometry shape) {
		this.shape = shape;
	}
	  
	  
}
