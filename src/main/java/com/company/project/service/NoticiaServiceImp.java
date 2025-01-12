package com.company.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.project.model.NoticiaModel;
import com.company.project.repository.NoticiaRepository;

@Service
public class NoticiaServiceImp implements NoticiaService{
	
	@Autowired
	NoticiaRepository noticiaRepository;

	@Override
	public NoticiaModel save(NoticiaModel nt) {
		// TODO Auto-generated method stub
		return noticiaRepository.save(nt);
	}

	@Override
	public List<NoticiaModel> verNoticias() {
		// TODO Auto-generated method stub
		return noticiaRepository.findAll();
	}
	
	

}
