package com.leonardo.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardo.cursomc.domain.Categoria;
import com.leonardo.cursomc.repositories.CategoriaRepository;
import com.leonardo.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo; // automaticamente instanciada pelo spring
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
											"Objeto não encontrado! id: " + id + " , Tipo: " + Categoria.class.getName()));
	}
	
}
