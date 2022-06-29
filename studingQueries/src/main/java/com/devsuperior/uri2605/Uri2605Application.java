package com.devsuperior.uri2605;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.uri2605.dto.ProductMinDTO;
import com.devsuperior.uri2605.projections.ProductMinProjection;
import com.devsuperior.uri2605.repositories.ProductRepository;

@SpringBootApplication
public class Uri2605Application implements CommandLineRunner {

	@Autowired
	private ProductRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Uri2605Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<ProductMinProjection> list = repository.search1(6);
		List<ProductMinDTO> result1 = list.stream().map(x -> new ProductMinDTO(x)).collect(Collectors.toList());

		System.out.println("\n**Resultado SQL Raiz**");
		for (ProductMinDTO obj : result1) {
			System.out.println(obj);
		}
		/*
		System.out.println("\n\n");

		List<ProductMinDTO> result2 = repository.search2(6);

		System.out.println("\n**Resultado SQL Raiz**");
		for (ProductMinDTO obj : result2) {
			System.out.println(obj);
		}
		*/
	}
}
