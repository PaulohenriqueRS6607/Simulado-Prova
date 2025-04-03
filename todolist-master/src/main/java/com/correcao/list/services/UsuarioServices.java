package com.correcao.list.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.correcao.list.dtos.UsuarioDTO;
import com.correcao.list.entity.Usuario;
import com.correcao.list.repository.UsuarioRepository;

@Service
public class UsuarioServices { // 
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public UsuarioDTO salvar(UsuarioDTO dto) { 
		
		
		Usuario usuario = new Usuario(); 
		
		usuario.setNome(dto.getNome()); 
		
		usuario.setEmail(dto.getEmail()); 
		
		usuario = usuarioRepository.save(usuario); 
		
		return new UsuarioDTO(usuario); 
	}

}
//A classe `UsuarioServices` é um serviço (`@Service`) que gerencia operações relacionadas a `Usuario`.  

//### `salvar(UsuarioDTO dto)`  
//- Cria um novo objeto `Usuario`.  
//- Define `nome` e `email` com os valores do `dto`.  
//- Salva o usuário no banco usando `usuarioRepository.save(usuario)`.  
//- Retorna um `UsuarioDTO` com os dados do usuário salvo.