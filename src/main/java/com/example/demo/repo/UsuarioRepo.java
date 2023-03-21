package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelos.Empleado;
import com.example.demo.modelos.Usuario;
@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Integer>{
	Optional<Usuario> findOneByEmail(String email);
}
