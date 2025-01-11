package com.company.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.company.project.model.NoticiaModel;
import com.company.project.model.UsuarioModel;
import com.company.project.service.UsuarioService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
@RestController
@RequestMapping("/project")
@RequiredArgsConstructor
public class AuthController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@PostMapping(value="login")
	public String login() {
		//TODO: process POST request
		
		return "Login";
	}
	
	
	@PostMapping(value = "crear")
	public UsuarioModel registro(@RequestBody UsuarioModel us) {
		System.out.print(us);
		return usuarioService.Crear(us);
	}
	
	@PutMapping(value = "validar")
	public String validar(@RequestBody UsuarioModel us) {
		//TODO: process PUT request
		System.out.print(us);
		return usuarioService.Validar(us);
	}
	
	/*@PostMapping(value = "noticia/crear")
	public NoticiaModel crearNoticia(@RequestBody NoticiaModel us, @RequestParam MultipartFile img) {
		System.out.print(us);
		//return usuarioService.Crear(us);
	}*/
	
}
