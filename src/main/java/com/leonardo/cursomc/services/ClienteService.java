package com.leonardo.cursomc.services;

import java.util.Optional;

import com.leonardo.cursomc.domain.DTO.ClienteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardo.cursomc.domain.Cliente;
import com.leonardo.cursomc.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository repository;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repository.findById(id);
		return obj.orElse(null);
	}

	public Cliente create(ClienteDTO dto){
		Cliente cliente = Cliente.convertToEntity(dto);
		return repository.save(cliente);
	}
	
}
