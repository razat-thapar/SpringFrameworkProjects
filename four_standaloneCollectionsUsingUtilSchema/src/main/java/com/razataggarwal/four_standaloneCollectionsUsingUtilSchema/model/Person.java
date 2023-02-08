package com.razataggarwal.four_standaloneCollectionsUsingUtilSchema.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class Person {
	
	private long id ; 
	private String name; 
	private List<String> friends; 
	private Set<Address> addresses;  
	private Map<String,Long> contacts; 
	private Properties emails;
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
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Set<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}
	public Map<String, Long> getContacts() {
		return contacts;
	}
	public void setContacts(Map<String, Long> contacts) {
		this.contacts = contacts;
	}
	public Properties getEmails() {
		return emails;
	}
	public void setEmails(Properties emails) {
		this.emails = emails;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", friends=" + friends + ", addresses=" + addresses
				+ ", contacts=" + contacts + ", emails=" + emails + "]";
	}
	
	

	

}
