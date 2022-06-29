package com.devsuperior.uri2605.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.uri2605.dto.ProductMinDTO;
import com.devsuperior.uri2605.entities.Product;
import com.devsuperior.uri2605.projections.ProductMinProjection;

public interface ProductRepository extends JpaRepository<Product, Long> {

	@Query(nativeQuery = true, value = "SELECT products.name, providers.name "
			+ "FROM products "
			+ "INNER JOIN providers ON products.id_providers = providers.id "
			+ "INNER JOIN categories ON products.id_categories = categories.id "
			+ "WHERE categories.id = :id")
	List<ProductMinProjection> search1(Integer id);
	
	@Query("SELECT new com.devsuperior.uri2605.dto.ProductMinDTO(obj.name) "
			+ "FROM Product obj "
			+ "INNER JOIN providers ON products.id_providers = providers.id "
			+ "INNER JOIN categories ON products.id_categories = categories.id "
			+ "WHERE categories.id = :id")
	List<ProductMinDTO> search2(Integer id);
}
