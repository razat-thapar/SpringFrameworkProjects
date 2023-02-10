package com.razataggarwal.eight_understandingSpringJDBCModuleUsingXmlConfig;

import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.razataggarwal.eight_understandingSpringJDBCModuleUsingXmlConfig.dao.StudentDao;
import com.razataggarwal.eight_understandingSpringJDBCModuleUsingXmlConfig.dao.StudentDaoImp;
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
        
        context.close();
        
    }
}
