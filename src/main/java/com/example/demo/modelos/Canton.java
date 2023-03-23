package com.example.demo.modelos;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_canton")
public class Canton {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE) 
	@Column(name="id_canton")
	private int id_canton;
	
	@Column(name="canton")
	private String canton;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="provincia_id", nullable = false, updatable = false)
	private Provincia provincia;

	public String getCanton() {
		return canton;
	}

	public void setCanton(String canton) {
		this.canton = canton;
	}

	public Provincia getProvincia() {
		return provincia; 
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public int getId_canton() {
		return id_canton;
	}

	@Override
	public String toString() {
		return "Canton [id_canton=" + id_canton + "]";
	}

	
	
	
}
