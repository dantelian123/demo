package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelos.Empleado;
@Repository
public interface EmpleadoRepo extends JpaRepository<Empleado, Integer>{
	
}
