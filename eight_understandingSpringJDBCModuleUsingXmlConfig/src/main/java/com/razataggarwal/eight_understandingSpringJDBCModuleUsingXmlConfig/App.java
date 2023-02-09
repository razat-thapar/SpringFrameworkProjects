package com.razataggarwal.eight_understandingSpringJDBCModuleUsingXmlConfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        JdbcTemplate jdbcTemplate= context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        //insert query
        String sql="insert into Student(name,city) values (?,?)";
        
        //executing query
        int rows=jdbcTemplate.update(sql, "abc","agra");
        
        System.out.println("no of rows inserted : "+rows);
        
        context.close();
        
    }
}
