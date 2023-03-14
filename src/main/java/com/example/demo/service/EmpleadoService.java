package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelos.Empleado;
import com.example.demo.repo.EmpleadoRepo;

@Service
public class EmpleadoService{
	
	@Autowired
	private EmpleadoRepo empleadoRepo;
	
	
	public Empleado insertar(Empleado emp) {
		return empleadoRepo.save(emp);
	}
	public Empleado actualizar(Empleado emp) {
		return empleadoRepo.save(emp);
	}
	public List<Empleado> listar(){
		return empleadoRepo.findAll();
	}
	
	public void eliminar(Empleado emp) {
		empleadoRepo.delete(emp);
	}
}
