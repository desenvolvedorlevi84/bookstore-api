package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
