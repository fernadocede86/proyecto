/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tallerperiodo.dominio;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "estudiante")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstudiante;
    
    private String descripcion;
    @JsonIgnore
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="pensum_id")
	private Set<Pensum> pensum;
    
    public Estudiante() {
        super();
    }

    
    



	public Estudiante(Set<Pensum> pensum) {
		super();
		this.pensum = pensum;
	}

	




	public Estudiante(int idEstudiante, String descripcion) {
		super();
		this.idEstudiante = idEstudiante;
		this.descripcion = descripcion;
	}






	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set<Pensum> getPensum() {
		return pensum;
	}

	public void setPensum(Set<Pensum> pensum) {
		this.pensum = pensum;
	}

	

	
	
	
    
    
}
