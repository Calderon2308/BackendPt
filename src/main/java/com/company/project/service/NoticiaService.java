package com.company.project.service;

import java.util.List;

import com.company.project.model.NoticiaModel;

public interface NoticiaService {
	
	NoticiaModel save(NoticiaModel nt);
	
	List<NoticiaModel> verNoticias();

}
