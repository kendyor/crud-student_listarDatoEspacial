package com.cenepred.appcnp.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.vividsolutions.jts.geom.Geometry;

@Entity 
@Table(name = "t_ambito", schema="v3")
public class Ambito {
		@Id
	  private long id ;
	  @Column
	  private String ubigeo ;
	  @Column
	  private String  nombre ;
	  @Column
	  private String descripcion;
	  @Column
	  private Geometry shape;
	  @Column
	  private LocalDateTime updated_at;
	  @Column
	  private LocalDateTime created_at;

	  
	  
	  
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
	public LocalDateTime getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(LocalDateTime updated_at) {
		this.updated_at = updated_at;
	}
	public LocalDateTime getCreated_at() {
		return created_at;
	}
	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}
	
	  
	  
}

