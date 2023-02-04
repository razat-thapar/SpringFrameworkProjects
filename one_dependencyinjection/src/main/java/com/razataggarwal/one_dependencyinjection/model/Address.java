package com.razataggarwal.one_dependencyinjection.model;

public class Address {
	
	private int addressId; 
	private String city; 
	private String street; 
	private String country; 
	private int pincode;
	
	public Address() {
		
	}
	
	public Address(int addressId,  String street,String city, String country, int pincode) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.street = street;
		this.country = country;
		this.pincode = pincode;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
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
		return "Address [addressId=" + addressId + ", city=" + city + ", street=" + street + ", country=" + country
				+ ", pincode=" + pincode + "]";
	} 
	
	
}
