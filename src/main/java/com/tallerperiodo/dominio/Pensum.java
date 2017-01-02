/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tallerperiodo.dominio;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity (name= "pensum")
public class Pensum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pensum_id;
    
    private int materiaid;
    
    private int grupoid;

    @ManyToOne
    @JoinColumn(name="estudiante_id")
    private Estudiante estudiante;
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="periodoid")
    private PeriodosLectivos periodoslectivos;

    
    
    
    
	public Pensum() {
		super();
	}

	
	public Pensum(int pensum_id, int materiaid, int grupoid, Estudiante estudiante) {
		super();
		this.pensum_id = pensum_id;
		this.materiaid = materiaid;
		this.grupoid = grupoid;
		this.estudiante = estudiante;
	}


	public int getPensum_id() {
		return pensum_id;
	}

	public void setPensum_id(int pensum_id) {
		this.pensum_id = pensum_id;
	}

	public int getMateriaid() {
		return materiaid;
	}

	public void setMateriaid(int materiaid) {
		this.materiaid = materiaid;
	}

	public int getGrupoid() {
		return grupoid;
	}

	public void setGrupoid(int grupoid) {
		this.grupoid = grupoid;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public PeriodosLectivos getPeriodoslectivos() {
		return periodoslectivos;
	}

	public void setPeriodoslectivos(PeriodosLectivos periodoslectivos) {
		this.periodoslectivos = periodoslectivos;
	}
    
	
	

	
}
