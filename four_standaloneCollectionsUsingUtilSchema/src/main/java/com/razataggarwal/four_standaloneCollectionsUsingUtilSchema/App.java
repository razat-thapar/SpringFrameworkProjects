package com.razataggarwal.four_standaloneCollectionsUsingUtilSchema;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.razataggarwal.four_standaloneCollectionsUsingUtilSchema.model.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Person p1 = context.getBean("person1",Person.class);
        System.out.println(p1);
        context.close();
    }
}
