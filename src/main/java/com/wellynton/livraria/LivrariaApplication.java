package com.wellynton.livraria;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wellynton.livraria.domain.categoria.Categoria;
import com.wellynton.livraria.domain.categoria.CategoriaRepository;
import com.wellynton.livraria.domain.livro.Livro;
import com.wellynton.livraria.domain.livro.LivroRepository;

@SpringBootApplication
public class LivrariaApplication implements CommandLineRunner {

	@Autowired
	CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(LivrariaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria(null, "Tecnologia", "Livros de tecnologia");
		categoriaRepository.save(cat1);
	
	}

}
