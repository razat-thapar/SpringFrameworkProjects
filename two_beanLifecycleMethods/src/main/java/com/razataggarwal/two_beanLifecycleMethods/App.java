package com.razataggarwal.two_beanLifecycleMethods;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.razataggarwal.two_beanLifecycleMethods.model.Pizza;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	
    	//approach 1 : using xml configuration. 
        System.out.println("Lifecycle Methods configuration using XML");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        context.registerShutdownHook(); //close the context before JVM shutdowns. 
        
        Pizza p1 = (Pizza)context.getBean("pizza1");
        System.out.println("Printing bean "+p1);
        
        
    }
}
