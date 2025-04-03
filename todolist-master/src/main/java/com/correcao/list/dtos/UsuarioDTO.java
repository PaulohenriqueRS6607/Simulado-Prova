package com.correcao.list.dtos;

import com.correcao.list.entity.Usuario;

public class UsuarioDTO { // Essa classe UsuarioDTO é um DTO que representa os dados de um usuário, contendo id, nome e email.
	
	private Long id;
	private String nome;
	private String email;
	
	public UsuarioDTO() {
	}

	public UsuarioDTO(Long id, String nome, String email) { // Esse é um construtor que permite criar um objeto `UsuarioDTO` passando `id`, `nome` e `email` como parâmetros.
		this.id = id;
		this.nome = nome;
		this.email = email;
	}
	
	

	public UsuarioDTO(Usuario entity) { // Esse construtor cria um `UsuarioDTO` a partir de uma entidade `Usuario`, copiando seus dados (`id`, `nome` e `email`).
		id = entity.getId();
		nome = entity.getNome();
		email = entity.getEmail();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
