package com.razataggarwal.five_stereotypeAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.razataggarwal.five_stereotypeAnnotations.model.Person;
import com.razataggarwal.five_stereotypeAnnotations.model.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        
        System.out.println("-----------------------------------------------");
        System.out.println("Understanding @Component annotation alternate to <bean> tag.");
        Person p = context.getBean("person",Person.class);
        System.out.println(p);
        System.out.println("-----------------------------------------------");
        System.out.println("Understanding Scope using scope attribute in <bean> tag");
        
        System.out.println("-----------------------------------------------");
        System.out.println("Understanding Scope using @Scope annotation");
        Teacher t1 = context.getBean(Teacher.class);
        System.out.println("Hashcode of 1st Object: "+t1.hashCode());
        Teacher t2 = context.getBean(Teacher.class);
        System.out.println("Hashcode of 2nd Object: "+t2.hashCode());
        
        context.close();
    }
}
