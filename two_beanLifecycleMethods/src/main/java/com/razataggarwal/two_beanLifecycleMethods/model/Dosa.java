package com.razataggarwal.two_beanLifecycleMethods.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Dosa implements InitializingBean , DisposableBean{
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
		return "Dosa [name=" + name + ", price=" + price + "]";
	}
	public void destroy() throws Exception {
		System.out.println(this.getClass().getName()+" : "+"calling destroy() method , throwing it to bin");
		
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println(this.getClass().getName()+" : "+"calling init() method after dependency injection");
		
	} 
	
	
	
}
