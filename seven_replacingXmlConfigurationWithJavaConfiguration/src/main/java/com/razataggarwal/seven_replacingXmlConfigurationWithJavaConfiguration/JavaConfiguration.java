package com.razataggarwal.seven_replacingXmlConfigurationWithJavaConfiguration;

import java.util.List;
import java.util.Stack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.razataggarwal.seven_replacingXmlConfigurationWithJavaConfiguration.model.Programmer;

@Configuration
@ComponentScan(basePackages="com.razataggarwal.seven_replacingXmlConfigurationWithJavaConfiguration")
public class JavaConfiguration {
	
	@Autowired
	ApplicationContext context; 
	
	@Bean(name="programmers")
	public List<Programmer> getProgrammerBean() {
		//create a list of programmers  
		Stack<Programmer> programmers = new Stack<Programmer>();
		for(int i=0;i<10;i++) {
			programmers.push(context.getBean(Programmer.class));
		}
		return programmers; 
	}
}
