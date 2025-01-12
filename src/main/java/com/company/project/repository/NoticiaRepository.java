package com.company.project.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.company.project.model.NoticiaModel;


public interface NoticiaRepository extends Repository<NoticiaModel, Integer> {
	
	NoticiaModel save(NoticiaModel nt);
	
	List<NoticiaModel> findAll();

}
