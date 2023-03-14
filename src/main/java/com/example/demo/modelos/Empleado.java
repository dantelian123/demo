package com.example.demo.modelos;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigo")
	private Integer codigo;
	@Column(name="nombre")
	private String nombre;
	@Column(name="apellido")
	private String apellido;
	@Column(unique = true, name = "cedula" )	
	private String cedula;
	@Column(name="edad")
	private int edad;
	@Column(name="telefono")
	private String telefono;
	@Column(name="fecha_nac")
	private Date fechaNac;
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
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public int getCodigo() {
		return codigo;
	}
	@Override
	public String toString() {
		return "Empleado [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
				+ ", edad=" + edad + ", telefono=" + telefono + ", fechaNac=" + fechaNac + "]";
	}
	
	
}
