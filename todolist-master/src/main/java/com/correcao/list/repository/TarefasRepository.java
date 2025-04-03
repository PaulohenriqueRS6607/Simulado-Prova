package com.correcao.list.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.correcao.list.entity.Tarefas;

@Repository
public interface TarefasRepository extends JpaRepository<Tarefas, Long>{

}
//Essa interface `TarefasRepository` é um repositório JPA que permite operações no banco de dados para a entidade `Tarefas`.  

//- `extends JpaRepository<Tarefas, Long>`: Fornece métodos prontos como `save()`, `findById()`, `findAll()`, `deleteById()`, etc.  
//- `@Repository`: Indica que é um componente Spring responsável pelo acesso aos dados.