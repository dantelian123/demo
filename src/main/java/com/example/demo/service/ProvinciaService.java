package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.modelos.Provincia;

import com.example.demo.repo.ProvinciaRepo;

@Service
public class ProvinciaService{
	
	@Autowired
	private ProvinciaRepo provinciaRepo;
		
	public List<Provincia> listar(){
		return provinciaRepo.findAll();
	}
	public List<Provincia> buscarPorNombre(String provincia){
		return provinciaRepo.findByName(provincia);
	}
	
}
