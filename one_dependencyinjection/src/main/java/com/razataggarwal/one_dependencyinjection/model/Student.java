package com.razataggarwal.one_dependencyinjection.model;

public class Student {
	
	private int studentId; 
	private String studentName; 
	private Address perm_address;
	public Student(int studentId, String studentName, Address perm_address) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.perm_address = perm_address;
	}
	public Student() {
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Address getPerm_address() {
		return perm_address;
	}
	public void setPerm_address(Address perm_address) {
		this.perm_address = perm_address;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", perm_address=" + perm_address
				+ "]";
	} 
	
	

}
