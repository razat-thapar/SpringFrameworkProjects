package com.razataggarwal.five_stereotypeAnnotations.model;

public class Student extends Person{
	
	private String classLevel;

	public String getClassLevel() {
		return classLevel;
	}

	public void setClassLevel(String classLevel) {
		this.classLevel = classLevel;
	}

	@Override
	public String toString() {
		return "Student [classLevel=" + classLevel + ", toString()=" + super.toString() + "]";
	}
	
}
