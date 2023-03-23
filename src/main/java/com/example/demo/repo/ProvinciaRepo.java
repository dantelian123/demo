package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.modelos.Empleado;
import com.example.demo.modelos.Provincia;
@Repository
public interface ProvinciaRepo extends JpaRepository<Provincia, Integer>{
	
	@Query(value = "SELECT * FROM tbl_provincia WHERE id_provincia=1", nativeQuery=true)
	List<Provincia> findByName(String provincia);
	
//	@Query(value = "Select tbl_provincia.nombre, tbl_canton.canton FROM tbl_provincia  INNER JOIN tbl_canton "
//			+ "ON tbl_provincia.id_provincia = tbl_canton.provincia_id", nativeQuery=true)
	List<Provincia> findAll();
}
