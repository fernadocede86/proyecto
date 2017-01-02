package com.tallerperiodo.dominio;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "periodosLectivos")
public class PeriodosLectivos {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int periodo_id;
	private String descripcion;
	
	
	
	public int getPeriodo_id() {
		return periodo_id;
	}

	public void setPeriodo_id(int periodo_id) {
		this.periodo_id = periodo_id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	

	
	

	
	
	

}
