package com.company.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.company.project.model.UsuarioModel;

public interface UsuarioRepository extends Repository<UsuarioModel, Integer> {

	UsuarioModel save(UsuarioModel us);
	

	@Query("SELECT u.idrol FROM UsuarioModel u WHERE u.usuario = :usuario AND u.contrasena = :contrasena")
	String compareUser(@Param("usuario") String usuario, @Param("contrasena") String contrasena);

}
