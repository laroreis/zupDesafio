package com.laroproducoes.desafiozup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laroproducoes.desafiozup.model.enderecoModel;

@Repository
public interface enderecoRepository extends JpaRepository<enderecoModel, Long> {

}
