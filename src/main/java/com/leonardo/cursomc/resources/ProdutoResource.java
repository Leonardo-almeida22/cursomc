package com.leonardo.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.leonardo.cursomc.domain.Produto;
import com.leonardo.cursomc.services.ProdutoService;

@RestController
@RequestMapping(value="/produtos")
public class ProdutoResource {

	@Autowired
	ProdutoService service;
	
	@RequestMapping(value="/{id}", method= RequestMethod.GET )
	public ResponseEntity<?> find(@PathVariable Integer id){
		Produto obj = service.buscar(id);
		return  ResponseEntity.ok().body(obj);
	}
}
