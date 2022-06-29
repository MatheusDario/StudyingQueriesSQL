package com.devsuperior.uri2607.dto;

import com.devsuperior.uri2607.projections.ProviderMinProjection;

public class ProviderMinDTO {
	
	private String city;
	
	public ProviderMinDTO() {
	}

	public ProviderMinDTO(String city) {
		this.city = city;
	}
	
	public ProviderMinDTO(ProviderMinProjection projection) {
		city = projection.getCity();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "ProviderMinDTO [city=" + city + "]";
	}	
}
