package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.modelos.Usuario;
import com.example.demo.repo.UsuarioRepo;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Usuario usuario = usuarioRepo.findOneByEmail(email)
				.orElseThrow(() -> new UsernameNotFoundException("El usuario con Email " + email + " no existe"));
		return new UserDetailsImpl(usuario); 
	}

	@Autowired
	private UsuarioRepo usuarioRepo;
}
