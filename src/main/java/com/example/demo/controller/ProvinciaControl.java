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
import com.example.demo.modelos.Provincia;
import com.example.demo.service.EmpleadoService;
import com.example.demo.service.ProvinciaService;
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/provincia")
public class ProvinciaControl {

	@Autowired
	private ProvinciaService provinciaService;
	
	@GetMapping
	public List<Provincia> listar(){
		System.out.println(provinciaService.listar());
		return provinciaService.listar(); 
	}
	
	@GetMapping("/{nombreProvincia}")
	public List<Provincia> buscarPorNombre(@PathVariable String nombreProvincia) {
		System.out.println(provinciaService.buscarPorNombre(nombreProvincia));
		return provinciaService.buscarPorNombre(nombreProvincia);
		
	}
	
}
