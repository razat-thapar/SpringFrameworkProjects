package com.razataggarwal.six_springExpressionLanguage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.razataggarwal.six_springExpressionLanguage.model.SpelDemo;
import com.razataggarwal.six_springExpressionLanguage.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	
    	System.out.println("-------------------------------------------");
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
    	System.out.println("Using SpEL in value attribute of <property> / <constructor-arg> tags in XML");
        User user1 = context.getBean("user1",User.class);
        System.out.println(user1);
    	System.out.println("-------------------------------------------");
    	System.out.println("Using SpEL in @Value annotation");
        User user2 = context.getBean("user",User.class);
        System.out.println(user2);
        
        SpelDemo demo = context.getBean(SpelDemo.class);
        System.out.println(demo);
        
    	System.out.println("-------------------------------------------");
    	context.close();
    }
}
