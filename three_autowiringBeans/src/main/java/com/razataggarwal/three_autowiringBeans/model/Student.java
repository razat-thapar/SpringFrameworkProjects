package com.razataggarwal.three_autowiringBeans.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	private long id; 
	private String name;
	
	//autowiring using property
	//@Autowired
	private Address address;
	
	
	//autowiring using constructor. 
	//@Autowired
	public Student(Address address) {
		super();
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}
	
	//autowiring using setter method. 
	//@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
	

}
