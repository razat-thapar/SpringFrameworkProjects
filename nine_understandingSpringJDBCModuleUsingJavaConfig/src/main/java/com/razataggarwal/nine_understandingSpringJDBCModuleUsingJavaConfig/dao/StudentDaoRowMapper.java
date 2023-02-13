package com.razataggarwal.nine_understandingSpringJDBCModuleUsingJavaConfig.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.razataggarwal.nine_understandingSpringJDBCModuleUsingJavaConfig.entity.Student;

@Component
public class StudentDaoRowMapper implements RowMapper<Student> {
	
	private ApplicationContext context; 
	
	@Autowired
	public void setContext(ApplicationContext context) {
		this.context = context;
	}
	
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student student = context.getBean(Student.class);
		
		try {
			student.setId(rs.getInt(1));
			student.setName(rs.getString(2));
			student.setCity(rs.getString(3));
			return student;
		}catch(EmptyResultDataAccessException e) {
			//handling no results in resultSet
			return null; 
		}
	}

}
