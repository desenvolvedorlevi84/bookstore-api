package com.example.demo.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Categoria;
import com.example.demo.domain.Livro;
import com.example.demo.repositories.CategoriaRepository;
import com.example.demo.repositories.LivroRepository;

@Service
public class DBService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;
	
	public void instanciaBaseDeDados() {
		
		Categoria cat1 = new Categoria(null, "Informática", "Livros de TI");
		Categoria cat2 = new Categoria(null, "Mercado Financeiro", "Daytrade");
		Categoria cat3 = new Categoria(null, "Vida Saudável", "Receitas e Dicas");
		
		Livro l1 = new Livro(null, "Clean Code", "Robert Martin", "Lorem ipsum", cat1);
		Livro l2 = new Livro(null, "All Brooks 01", "All Brooks", "Lorem ipsum", cat2);
		Livro l3 = new Livro(null, "Segredo do Gráfico", "Isaque Levi", "Lorem ipsum", cat2);
		Livro l4 = new Livro(null, "Programador Senior", "Luiz Felipe", "Lorem ipsum", cat1);
		Livro l5 = new Livro(null, "Receitas Fitness da Vovó", "Nedir Alves", "Lorem ipsum", cat3);
		
		cat1.getLivros().addAll(Arrays.asList(l1, l4));
		cat2.getLivros().addAll(Arrays.asList(l2, l3));
		cat3.getLivros().addAll(Arrays.asList(l5));
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		this.livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));
		
	}

}
