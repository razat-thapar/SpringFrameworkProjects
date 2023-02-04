package com.razataggarwal.one_dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.razataggarwal.one_dependencyinjection.model.Address;
import com.razataggarwal.one_dependencyinjection.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //manual dependency injection by programmer. 
        System.out.println("Manual DI by programmer");
        //constuctor based injection 
        Address address1 = new Address(1,"#4","patiala","India",147001); 
        
        //setter based injection. 
        Student student1 = new Student(); 
        student1.setStudentId(1);
        student1.setStudentName("Razat Aggarwal");
        student1.setPerm_address(address1);
        
        System.out.println(student1);
        
        //Spring based dependency injection using IOC container. 
        System.out.println("Spring DI by IOC container.");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml"); 
        
        //context.xml uses setter based injection. 
        
        Student student2= context.getBean(Student.class);
        System.out.println(student2);
    }
}
