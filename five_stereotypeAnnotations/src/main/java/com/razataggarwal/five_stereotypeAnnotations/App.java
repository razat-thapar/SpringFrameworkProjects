package com.razataggarwal.five_stereotypeAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.razataggarwal.five_stereotypeAnnotations.model.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Person p = context.getBean("person",Person.class);
        System.out.println(p);
        context.close();
    }
}
