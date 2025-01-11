package com.company.project.service;

import com.company.project.model.UsuarioModel;

public interface UsuarioService {

	UsuarioModel Crear(UsuarioModel us);
	
	String Validar(UsuarioModel us);
	
	
}
