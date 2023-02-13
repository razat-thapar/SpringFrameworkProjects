package com.razataggarwal.nine_understandingSpringJDBCModuleUsingJavaConfig;

import java.sql.SQLException;
import java.util.Optional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;

import com.razataggarwal.nine_understandingSpringJDBCModuleUsingJavaConfig.dao.StudentDao;
import com.razataggarwal.nine_understandingSpringJDBCModuleUsingJavaConfig.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//IOC container 
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
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
        System.out.println("--------------------------------------------------------");
        System.out.println("-------------Select Operation---------------------------");
        try {
        	Optional<Student> student2 =studentDao.getStudentById(3L);
        	if(student2.isEmpty()) {
        		System.out.println("Not Found!");
        	}else {
        		System.out.println(student2.get());
        	}
        }catch(EmptyResultDataAccessException e) {
        	System.out.println("Not Found!");
        }catch(SQLException e) {
        	e.printStackTrace();
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("-------------Select ALL Operation---------------------------");
        try {
        	for(Student student : studentDao.getAllStudents()) {
        		System.out.println(student);
        	}
        }catch(SQLException e) {
        	e.printStackTrace();
        }
        context.close();
    }
}
