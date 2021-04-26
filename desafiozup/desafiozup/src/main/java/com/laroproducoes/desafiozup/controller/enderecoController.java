package com.laroproducoes.desafiozup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laroproducoes.desafiozup.exception.resourceNotFoundException;
import com.laroproducoes.desafiozup.model.enderecoModel;
import com.laroproducoes.desafiozup.model.usuarioModel;
import com.laroproducoes.desafiozup.repository.enderecoRepository;
import com.laroproducoes.desafiozup.service.usuarioService;

@RestController
@RequestMapping("/endereco")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class enderecoController {
	

	@Autowired
	private enderecoRepository enderecoRepository;
	
	@Autowired
	private usuarioService usuarioService;
	
	@PostMapping("/cadastrar")
	public ResponseEntity<enderecoModel> post (@RequestBody enderecoModel endereco) {
	
		try {
			return ResponseEntity.status(HttpStatus.CREATED).body(enderecoRepository.save(endereco));
		}catch (Exception exception) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@GetMapping("/idusuario/{id}")
    public ResponseEntity <usuarioModel> getAllEnderecos(@PathVariable long id) throws resourceNotFoundException {
			return ResponseEntity.ok(usuarioService.EncontrarEndereco(id));
    }

}//fim
