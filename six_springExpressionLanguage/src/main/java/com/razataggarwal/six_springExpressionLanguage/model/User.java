package com.razataggarwal.six_springExpressionLanguage.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
	@Value("1")
	private Long id; 
	@Value("Razat Aggarwal")
	private String name;
	@Value("#{ systemProperties['user.country'] }")
	private String country; 
	@Value("#{ systemProperties['user.region'] }")
	private String region;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", country=" + country + ", region=" + region + "]";
	} 
	
	
	
}
