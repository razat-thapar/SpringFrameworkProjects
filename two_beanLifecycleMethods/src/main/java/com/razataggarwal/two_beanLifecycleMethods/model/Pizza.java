package com.razataggarwal.two_beanLifecycleMethods.model;

public class Pizza {
	
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
	
	public void init() {
		System.out.println(this.getClass().getName()+" : "+"Calling init() method post dependency injection");
	}
	
	public void destroy() {
		System.out.println(this.getClass().getName()+" : "+"Calling destroy() method before destroying bean");
	}
	
	@Override
	public String toString() {
		return "Pizza [name=" + name + ", price=" + price + "]";
	}
	
	

}
