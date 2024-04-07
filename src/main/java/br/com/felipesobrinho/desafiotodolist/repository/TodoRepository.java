package br.com.felipesobrinho.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.felipesobrinho.desafiotodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
