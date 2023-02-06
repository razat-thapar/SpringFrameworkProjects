package com.razataggarwal.two_beanLifecycleMethods.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Burger {
	private String name; 
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Burger [name=" + name + ", price=" + price + "]";
	} 
	
	@PostConstruct
	public void init() {
		System.out.println(this.getClass().getName()+" : "+"calling init() method after dependency injection");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println(this.getClass().getName()+" : "+"calling destroy() method , throwing it to bin");
	}

}
