package com.leonardo.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardo.cursomc.domain.Estado;
import com.leonardo.cursomc.repositories.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
	EstadoRepository repository;
	
	public Estado buscar(Integer id) { 
		Optional<Estado> obj = repository.findById(id);
		return obj.orElse(null);
	}
	
}
