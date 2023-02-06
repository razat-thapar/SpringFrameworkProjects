package com.razataggarwal.one_dependencyinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.razataggarwal.one_dependencyinjection.model.Addition;
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
        
        //###########################################################
        //#############Spring based dependency injection using IOC container. 
        System.out.println("Spring DI by IOC container.");
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml","context_collections.xml","context_constructorBasedInjection.xml","context_ResolvingConstructorBasedInjectionAmbiguity.xml"); 
        
        //####USING setter based injection. 
        System.out.println("setter based injection");
        
        //primitive type injection beans. 
        Student student2= (Student)context.getBean("student1");
        Student student3= (Student)context.getBean("student2");
        
        System.out.println(student2);
        System.out.println(student3);
        
        //collection type injection bean. 
        Employee emp1 = (Employee)context.getBean("employee1");
        System.out.println(emp1);
        
        //####USING constructor based injection.
        System.out.println("constructor based injection");
        //primitive type injection beans. 
        Address address4= (Address)context.getBean("address4");
        Address address5= (Address)context.getBean("address5");
        
        System.out.println(address4);
        System.out.println(address5);
        
        //collection type injection bean. 
        Employee emp2 = (Employee)context.getBean("employee2");
        System.out.println(emp2);
        
        
        //Resolving ambiguity due to overloaded constructors in constructor based injection. 
        System.out.println("Resolving ambiguity in Constructor based injection examples");
        Addition addition1 = (Addition)context.getBean("addition1");
        System.out.println(addition1);
        addition1.doSum();
        Addition addition2 = (Addition)context.getBean("addition2");
        System.out.println(addition2);
        addition2.doSum();
        Addition addition3 = (Addition)context.getBean("addition3");
        System.out.println(addition3);
        addition3.doSum();
        
        context.close();
        
    }
}
