package com.razataggarwal.eight_understandingSpringJDBCModuleUsingXmlConfig;

import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.razataggarwal.eight_understandingSpringJDBCModuleUsingXmlConfig.dao.StudentDao;
import com.razataggarwal.eight_understandingSpringJDBCModuleUsingXmlConfig.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//IOC container 
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        //student bean 
        Student student1 = context.getBean("student",Student.class);
        //setting name and city
        student1.setName("Stuart Little");
        student1.setCity("Disney Land");
        //student dao bean. 
        StudentDao studentDao = context.getBean(StudentDao.class);
        System.out.println("--------------------------------------------------------");
        System.out.println("-------------INSERT Operation---------------------------");
        int rows = 0;
		try {
			rows = studentDao.createStudent(student1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(student1);
        System.out.println("no of rows inserted : "+rows);
        System.out.println("--------------------------------------------------------");
        System.out.println("-------------Update Operation---------------------------");
        try {
        	student1.setCity("new york");
        	student1.setName("student1");
        	rows= studentDao.updateStudentById(3L, student1);
        	System.out.println("no of rows updated : "+rows);
        }catch(SQLException e) {
        	e.printStackTrace();
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("-------------Delete Operation---------------------------");
        try {
        	student1.setCity("new york");
        	student1.setName("student1");
        	rows= studentDao.deleteStudentById(7L);
        	System.out.println("no of rows deleted : "+rows);
        }catch(SQLException e) {
        	e.printStackTrace();
        }
        context.close();
        
    }
}
