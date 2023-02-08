package com.razataggarwal.five_stereotypeAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.razataggarwal.five_stereotypeAnnotations.model.Person;
import com.razataggarwal.five_stereotypeAnnotations.model.Student;
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
        Student s1 = context.getBean(Student.class);
        System.out.println("Hashcode of 1st Student object : "+s1.hashCode());
        Student s2 = context.getBean(Student.class);
        System.out.println("Hashcode of 2nd Student object : "+s2.hashCode());
        System.out.println("Scope : "+ ((s1.hashCode()==s2.hashCode())?"singleton scope":"prototype scope"));
        System.out.println("-----------------------------------------------");
        System.out.println("Understanding Scope using @Scope annotation");
        Teacher t1 = context.getBean(Teacher.class);
        System.out.println("Hashcode of 1st Object: "+t1.hashCode());
        Teacher t2 = context.getBean(Teacher.class);
        System.out.println("Hashcode of 2nd Object: "+t2.hashCode());
        System.out.println("Scope : "+ ((t1.hashCode()==t2.hashCode())?"singleton scope":"prototype scope"));
        
        context.close();
    }
}
