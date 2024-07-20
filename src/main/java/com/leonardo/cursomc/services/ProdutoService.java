package com.leonardo.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardo.cursomc.domain.Produto;
import com.leonardo.cursomc.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	ProdutoRepository repository;
	
	
	public Produto buscar(Integer id) {
		Optional<Produto> obj = repository.findById(id);
		return obj.orElse(null);
	}
}
