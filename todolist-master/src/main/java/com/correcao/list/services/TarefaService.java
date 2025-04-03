package com.correcao.list.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.correcao.list.dtos.TarefaDTO;
import com.correcao.list.entity.Tarefas;
import com.correcao.list.entity.Usuario;
import com.correcao.list.enums.Prioridade;
import com.correcao.list.enums.Status;
import com.correcao.list.repository.TarefasRepository;
import com.correcao.list.repository.UsuarioRepository;

@Service
public class TarefaService { 
	//A classe `TarefaService` é um serviço do Spring (`@Service`) que contém a lógica de negócio para `Tarefas`.  

//- `@Autowired TarefasRepository`: Injeta o repositório para manipular tarefas no banco.  
//- `@Autowired UsuarioRepository`: Injeta o repositório de usuários, possivelmente para associar tarefas a usuários.

	@Autowired
	TarefasRepository tarefasRepository;

	@Autowired
	UsuarioRepository usuarioRepository;

	public TarefaDTO salvar(TarefaDTO dto) {

		Tarefas tarefas = new Tarefas();

		tarefas.setDataCadastro(LocalDate.now());

		tarefas.setDescricao(dto.getDescricao());

		tarefas.setPrioridade(Prioridade.BAIXO);

		tarefas.setSetor(dto.getSetor());

		tarefas.setStatus(Status.A_FAZER);

		Usuario usuario = usuarioRepository.getReferenceById(dto.getId_usuario());

		tarefas.setUsuario(usuario);

		tarefas = tarefasRepository.save(tarefas);

		return new TarefaDTO(tarefas);
	}

	public List<Tarefas> listar() {

		List<Tarefas> tarefas = tarefasRepository.findAll();

		return tarefas;
	}

}
//Essa classe contém dois métodos no `TarefaService`:  

//### `salvar(TarefaDTO dto)`  
//- Cria uma nova tarefa (`Tarefas`), definindo:  
 // - `dataCadastro` como a data atual.  
 // - `descricao` e `setor` com valores do `dto`.  
  //- `prioridade` como `BAIXO`.  
  //- `status` como `A_FAZER`.  
 //- Associa a tarefa a um `Usuario` buscando pelo `id_usuario` no `dto`.  
// Salva a tarefa no banco e retorna um novo `TarefaDTO`.  

//### `listar()`  
//- Retorna todas as tarefas do banco de dados usando `findAll()`.