package com.razataggarwal.three_autowiringBeans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.razataggarwal.three_autowiringBeans.model.Employee;
import com.razataggarwal.three_autowiringBeans.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        
        //autowiring using xml configuration. 
        System.out.println("autowiring using xml configuration.");
        
        Employee emp1 = context.getBean("employee1",Employee.class);
        System.out.println("Autowired default : "+emp1);
        Employee emp2 = context.getBean("employee2",Employee.class);
        System.out.println("Autowired byName : "+emp2);
        Employee emp3 = context.getBean("employee3",Employee.class);
        System.out.println("Autowired byType : "+emp3);
        Employee emp4 = context.getBean("employee4",Employee.class);
        System.out.println("Autowired by constructor : "+emp4);
        
        
        
        //autowiring using annotations. 
        System.out.println("\nautowiring using @Autowired.");
        Student stu1= context.getBean("student1",Student.class);
        System.out.println("Autowired using Annotation: "+stu1);
        context.close(); 
    }
}
