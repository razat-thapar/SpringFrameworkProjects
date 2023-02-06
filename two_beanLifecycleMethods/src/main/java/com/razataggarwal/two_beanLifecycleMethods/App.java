package com.razataggarwal.two_beanLifecycleMethods;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.razataggarwal.two_beanLifecycleMethods.model.Burger;
import com.razataggarwal.two_beanLifecycleMethods.model.Dosa;
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
        
        //approach 2 : using spring interfaces : InitializingBean & DisposableBean
        System.out.println("\nLifecycle Methods configuration using Interfaces");
        
        Dosa d1 = (Dosa) context.getBean("dosa1");
        System.out.println("Printing bean "+d1);
        
        //approach 3 : using @PostConstruct & @PreDestroy annotations. 
        System.out.println("\nLifecycle Methods configuration using Annotations");
        
        Burger b1 = (Burger) context.getBean("burger1");
        System.out.println("Printing Bean "+b1);
        
        context.close();
    }
}
