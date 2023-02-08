package com.razataggarwal.five_stereotypeAnnotations.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Value("1")
	private Long id; 
	@Value("Razat Aggarwal")
	private String name;
	@Value("#{bestFriends}")
	private List<String> friends; 
	
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
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", friends=" + friends + "]";
	}
	 
	
	

}
