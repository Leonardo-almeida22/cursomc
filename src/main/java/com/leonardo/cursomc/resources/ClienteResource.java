package com.leonardo.cursomc.resources;

import com.leonardo.cursomc.domain.DTO.ClienteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.leonardo.cursomc.domain.Cliente;
import com.leonardo.cursomc.services.ClienteService;

import java.util.List;

@RestController
public class ClienteResource {

	@Autowired
	ClienteService service;

	@GetMapping(value="/clientes")
	public List<Cliente> getAll(){
		return service.getAll();

	}
	
	@GetMapping(value="/clientes/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Cliente obj = service.buscarPorId(id);
		return ResponseEntity.ok().body(obj);
	}

	@PostMapping(value="/clientes")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Cliente> createCliente(@RequestBody ClienteDTO dto){
		Cliente obj = service.create(dto);
		return ResponseEntity.ok().body(obj);
	}
	
	
}
