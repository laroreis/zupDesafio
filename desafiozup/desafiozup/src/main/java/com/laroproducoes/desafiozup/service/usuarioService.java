package com.laroproducoes.desafiozup.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laroproducoes.desafiozup.exception.resourceNotFoundException;
import com.laroproducoes.desafiozup.model.usuarioModel;
import com.laroproducoes.desafiozup.repository.usuarioRepository;

@Service
public class usuarioService {

	@Autowired
	private usuarioRepository usuarioRepository;
	
	public Optional<usuarioModel> cadastrarUsuario (usuarioModel usuario) {
		
		if (usuarioRepository.findByCpf(usuario.getCpf()).isPresent() && usuarioRepository.findByEmail(usuario.getEmail()).isPresent()) {
			
			return null;
		}
		
		return Optional.of(usuarioRepository.save(usuario));
	}
	
	public usuarioModel EncontrarEndereco(long id) throws resourceNotFoundException{
		Optional<usuarioModel> usuario = usuarioRepository.findById(id);
		 if(usuario.isPresent() == false) {
	            throw new resourceNotFoundException("Usuárie: " + id + " não encontrade.");
	        }

		 usuario.get().getEndereco();
		 usuarioRepository.save(usuario.get());

	        return usuarioRepository.save(usuario.get());
	    }
}
