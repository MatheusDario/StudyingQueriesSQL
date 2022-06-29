package com.devsuperior.uri2602.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

	@Id
	private Long id;
	private String name;
	private Integer amount;
	private Double price;
	
	@ManyToOne
	@JoinColumn(name = "id_providers")
	private Provider provider;
	
	@ManyToOne
	@JoinColumn(name = "id_categories")
	private Category category;
	
	public Product() {
	}

	public Product(Long id, String name, Integer amount, Double price) {
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
}
