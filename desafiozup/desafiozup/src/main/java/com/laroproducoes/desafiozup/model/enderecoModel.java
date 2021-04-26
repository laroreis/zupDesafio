package com.laroproducoes.desafiozup.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_endereco")
public class enderecoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(max = 400)
	private String logradouro;
	
	@NotNull
	@Size(max = 8)
	private int numero;
	

	@Size(max = 400)
	private String complemento;
	
	@NotNull
	@Size(max = 400)
	private String bairro;
	
	
	@NotNull
	@Size(max = 400)
	private String cidade;
	
	
	@NotNull
	@Size(max = 400)
	private String estado;
	
	
	@NotNull
	@JsonFormat(pattern="nnnnn-ddd")
	private String cep;
	
	@ManyToOne
	@JsonIgnoreProperties("usuario")
	private usuarioModel usuario;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public usuarioModel getUsuario() {
		return usuario;
	}

	public void setUsuario(usuarioModel usuario) {
		this.usuario = usuario;
	}
	
	
	

}
