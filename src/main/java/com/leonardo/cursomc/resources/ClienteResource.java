package com.leonardo.cursomc.resources;

import com.leonardo.cursomc.domain.DTO.ClienteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.leonardo.cursomc.domain.Cliente;
import com.leonardo.cursomc.services.ClienteService;

@RestController(value="clientes")
public class ClienteResource {

	@Autowired
	ClienteService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Cliente obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}

	@PostMapping
	public ResponseEntity<Cliente> createCliente(@RequestBody ClienteDTO dto){
		Cliente obj = service.create(dto);
		return ResponseEntity.ok().body(obj);
	}
	
	
}
