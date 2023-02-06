package com.razataggarwal.one_dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.razataggarwal.one_dependencyinjection.model.Address;
import com.razataggarwal.one_dependencyinjection.model.Employee;
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
        
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml","context_collections.xml"); 
        
        //context.xml uses setter based injection. 
        
        //primitive type injection beans. 
        Student student2= (Student)context.getBean("student1");
        Student student3= (Student)context.getBean("student2");
        
        System.out.println(student2);
        System.out.println(student3);
        
        //collection type injection bean. 
        Employee emp1 = (Employee)context.getBean("employee1");
        System.out.println(emp1);
        
    }
}
