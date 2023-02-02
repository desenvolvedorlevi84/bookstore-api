package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Livro;

public interface LivroRepository extends JpaRepository<Livro, Integer> {

}
