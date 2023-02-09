package com.razataggarwal.seven_replacingXmlConfigurationWithJavaConfiguration.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Programmer extends User{
	private String programmingLang;

	public String getProgrammingLang() {
		return programmingLang;
	}

	public void setProgrammingLang(String programmingLang) {
		this.programmingLang = programmingLang;
	}

	@Override
	public String toString() {
		return "Programmer [programmingLang=" + programmingLang + ", toString()=" + super.toString() + "]";
	}
	
}
