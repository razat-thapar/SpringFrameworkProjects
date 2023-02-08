package com.razataggarwal.five_stereotypeAnnotations.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
@Scope("prototype")
public class Teacher extends Person{
	
	@Value("Computer Science")
	private String department; 
	@Value("3.5")
	private float yearsOfExperience;
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public float getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(float yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	@Override
	public String toString() {
		return "Teacher [department=" + department + ", yearsOfExperience=" + yearsOfExperience + ", toString()="
				+ super.toString() + "]";
	} 
	
	

}
