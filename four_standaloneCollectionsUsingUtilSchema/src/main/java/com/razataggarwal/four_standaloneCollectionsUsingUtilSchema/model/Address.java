package com.razataggarwal.four_standaloneCollectionsUsingUtilSchema.model;

public class Address implements Comparable<Address>{
	
	private long id; 
	private String city; 
	private String country; 
	private int pincode;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", country=" + country + ", pincode=" + pincode + "]";
	}
	public int compareTo(Address o) { 
		return ((this.id==o.getId())?0:(this.id>o.getId())?1:-1);
	} 
	
	

}
