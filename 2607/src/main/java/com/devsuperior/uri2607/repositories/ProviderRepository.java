package com.devsuperior.uri2607.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.uri2607.entities.Provider;
import com.devsuperior.uri2607.projections.ProviderMinProjection;

public interface ProviderRepository extends JpaRepository<Provider, Long> {

	@Query(nativeQuery = true, value = "SELECT city "
			+ "FROM providers "
			+ "ORDER BY city = :alphabeticalOrder")
	List<ProviderMinProjection> search1(String alphabeticalOrder);
}
