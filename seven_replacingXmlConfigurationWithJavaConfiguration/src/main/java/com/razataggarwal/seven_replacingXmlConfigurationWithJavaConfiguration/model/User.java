package com.razataggarwal.seven_replacingXmlConfigurationWithJavaConfiguration.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class User {
	private final long userId;
	private String userName;
	private static long counter=0;
	
	public User() {
		this.userId= ++counter;
	}
	
	public long getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + "]";
	}
	
	
	

}
