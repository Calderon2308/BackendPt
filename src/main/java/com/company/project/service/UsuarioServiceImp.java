package com.company.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.project.model.UsuarioModel;
import com.company.project.repository.UsuarioRepository;

@Service
public class UsuarioServiceImp implements UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public UsuarioModel Crear(UsuarioModel us) {
		return usuarioRepository.save(us);
	}

	@Override
	public String Validar(UsuarioModel us) {
		// TODO Auto-generated method stub
		System.out.print(us);
		return usuarioRepository.compareUser(us.getUsuario(), us.getContrasena());
	}
	
	

}
