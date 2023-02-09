package com.razataggarwal.six_springExpressionLanguage.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpelDemo {
	
	//syntax : " #{ expression } "
	
	//static method
	@Value(" #{ T(java.lang.Math).sqrt(16) } ")
	private double x; 
	
	//static variable (here using symbolic constant)
	@Value(" #{ T(java.lang.Math).PI } ")
	private double y;
	
	//object creation
	@Value(" #{ new java.lang.String('Razat Aggarwal') } ")
	private String name;
	
	//bean id coming from XML <bean> tag.
	@Value("#{ user }")
	private User user; 
	
	//boolean expression
	@Value(" #{ 8>3 } ")
	private boolean isGreater; 
	
	@Value(" #{ (T(java.lang.Math).sqrt(26))%1==0 } ")
	private boolean isPerfectSquare;
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public boolean isGreater() {
		return isGreater;
	}
	public void setGreater(boolean isGreater) {
		this.isGreater = isGreater;
	}
	public boolean isPerfectSquare() {
		return isPerfectSquare;
	}
	public void setPerfectSquare(boolean isPerfectSquare) {
		this.isPerfectSquare = isPerfectSquare;
	}
	@Override
	public String toString() {
		return "SpelDemo [x=" + x + ", y=" + y + ", name=" + name + ", user=" + user + ", isGreater=" + isGreater
				+ ", isPerfectSquare=" + isPerfectSquare + "]";
	} 
	
	
	
	

}
