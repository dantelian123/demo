package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelos.Empleado;
import com.example.demo.service.EmpleadoService;
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/empleado")
public class EmpleadoControl {

	@Autowired
	private EmpleadoService empleadoService;
	
	@GetMapping
	public List<Empleado> listar(){
		return empleadoService.listar(); 
	}
	@PostMapping
	public Empleado insertar(@RequestBody Empleado emp) {
		return empleadoService.insertar(emp);
	}
	
	@PutMapping
	public Empleado actualizar(@RequestBody Empleado emp) {
		return empleadoService.actualizar(emp);
	}
	
	@GetMapping("/{codigo}")
	public Optional<Empleado> buscarPorId(@PathVariable Integer codigo) {
		return empleadoService.buscarId(codigo);
	}
	
	@DeleteMapping("/{codigo}")
	public void eliminar(@PathVariable Integer codigo) {
		 empleadoService.eliminar(codigo);
	}
}
