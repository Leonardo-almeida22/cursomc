package com.leonardo.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardo.cursomc.domain.Cidade;
import com.leonardo.cursomc.repositories.CidadeRepository;

@Service
public class CidadeService {

	@Autowired
	CidadeRepository repository;
	
	
	public Cidade buscar(Integer id) {
		Optional<Cidade> obj = repository.findById(id);
		return obj.orElse(null);
		
	}
	
}
