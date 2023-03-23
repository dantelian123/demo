package com.example.demo.modelos;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_provincia")
public class Provincia {

	@Id
	//@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name="id_provincia")
	private int idProvincia;
	
	@Column(name="nombre")
	private String nombre;
	
	@OneToMany(mappedBy = "provincia")
	private List<Canton> cantones;
	
	
	public List<Canton> getCantones() {
		return cantones;
	}

	public void setCantones(List<Canton> cantones) {
		this.cantones = cantones;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdProvincia() {
		return idProvincia;
	}

	@Override
	public String toString() {
		return "Provincia [idProvincia=" + idProvincia + "]";
	}

	
	
	
}
