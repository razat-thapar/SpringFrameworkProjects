package com.razataggarwal.three_autowiringBeans.model;

public class Employee {
	private String name; 
	private String id; 
	private Address address;
	
	public Employee() {
		
	}
	
	public Employee(Address address2) {
		this.address=address2; 
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", address=" + address + "]";
	} 
	
	

}
