package com.laroproducoes.desafiozup.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laroproducoes.desafiozup.model.usuarioModel;

@Repository
public interface usuarioRepository extends JpaRepository<usuarioModel, Long> {

	public Optional<usuarioModel> findByCpf (String cpf);
	
	public Optional<usuarioModel> findByEmail (String email);
}
