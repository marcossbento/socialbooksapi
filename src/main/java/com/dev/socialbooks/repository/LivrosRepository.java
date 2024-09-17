package com.dev.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.socialbooks.domain.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Long>{
	
}
