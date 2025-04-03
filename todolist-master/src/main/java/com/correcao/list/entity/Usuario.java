package com.correcao.list.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_usuario") // Essa classe Usuario é uma entidade JPA mapeada para a tabela tb_usuario. @Id e @GeneratedValue(strategy = GenerationType.IDENTITY): Define id como chave primária com auto incremento. @Column(unique = true): Garante que o email seja único no banco.
public class Usuario { 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	@Column(unique = true) 
	private String email;

	@JsonIgnore 
	@OneToMany(mappedBy = "usuario") // Essa classe Usuario representa uma entidade JPA com relacionamento @OneToMany para Tarefas, onde um usuário pode ter várias tarefas. @JsonIgnore: Evita loop infinito na serialização JSON ao retornar dados. @OneToMany(mappedBy = "usuario"): Define a relação com Tarefas, indicando que usuario é o dono da relação.
	private List<Tarefas> tarefas; 
	
	public Usuario() {}

	public Usuario(Long id, String nome, String email) { 
		this.id = id;
		this.nome = nome;
		this.email = email;
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

	public List<Tarefas> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefas> tarefas) {
		this.tarefas = tarefas;
	}
	
	
	
	

}
