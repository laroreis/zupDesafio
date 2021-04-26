package com.laroproducoes.desafiozup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laroproducoes.desafiozup.model.usuarioModel;
import com.laroproducoes.desafiozup.repository.usuarioRepository;
@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class usuarioController {
	
	@Autowired
	private usuarioRepository usuarioRepository;
	
	@PostMapping("/cadastrar")
	public ResponseEntity<usuarioModel> post (@RequestBody usuarioModel usuario) {
		
		try {
			return ResponseEntity.status(HttpStatus.CREATED).body(usuarioRepository.save(usuario));
		}catch (Exception exception) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	

}
