package com.correcao.list.dtos;

import java.time.LocalDate;

import com.correcao.list.entity.Tarefas;
import com.correcao.list.enums.Prioridade;
import com.correcao.list.enums.Status;




public class TarefaDTO { 
	
	private Long id_usuario;
	
	private Long id;
	
	private String descricao;
	
	private String setor;
	
	private Prioridade prioridade;
	
	private Status status;
	
	private LocalDate dataCadastro;
	
	public TarefaDTO() {}

	public TarefaDTO(Long id_usuario, Long id, String descricao, String setor, Prioridade prioridade, Status status,
			LocalDate dataCadastro) {
		this.id_usuario = id_usuario;
		this.id = id;
		this.descricao = descricao;
		this.setor = setor;
		this.prioridade = prioridade;
		this.status = status;
		this.dataCadastro = dataCadastro;
	}
	
	public TarefaDTO(Tarefas entity) {
		id = entity.getId(); // retorna apenas o id do tarefas
		descricao = entity.getDescricao();
		setor = entity.getSetor();
		prioridade = entity.getPrioridade();
		status = entity.getStatus();
		dataCadastro = entity.getDataCadastro();
		
		// aqui ele tá retornando o id do usuario
		id_usuario = entity.getUsuario().getId(); // ele tá retornando o usuario, e dps retorna o id do usuario
	}

	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public Prioridade getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	
	
	
	

}
