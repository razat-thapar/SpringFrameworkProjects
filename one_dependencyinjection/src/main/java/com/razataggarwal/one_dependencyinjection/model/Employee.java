package com.razataggarwal.one_dependencyinjection.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	
	private Long employeeId; 
	private String employeeName; 
	private Set<Long> phoneNumbers; 
	private List<Address> addresses; 
	private Map<String , String> courses;
	private Properties emails;
	
	public Employee() {
		
	}
	
	public Employee(Long employeeId, String employeeName, Set<Long> phoneNumbers, List<Address> addresses,
			Map<String, String> courses , Properties emails) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.phoneNumbers = phoneNumbers;
		this.addresses = addresses;
		this.courses = courses;
		this.emails= emails; 
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Set<Long> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(Set<Long> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public Properties getEmails() {
		return emails;
	}

	public void setEmails(Properties emails) {
		this.emails = emails;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", phoneNumbers="
				+ phoneNumbers + ", addresses=" + addresses + ", courses=" + courses + ", emails=" + emails + "]";
	}


	
	

}
