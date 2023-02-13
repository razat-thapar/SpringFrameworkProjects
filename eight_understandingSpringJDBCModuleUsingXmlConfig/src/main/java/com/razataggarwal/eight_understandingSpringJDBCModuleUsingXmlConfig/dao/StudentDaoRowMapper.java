package com.razataggarwal.eight_understandingSpringJDBCModuleUsingXmlConfig.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;

import com.razataggarwal.eight_understandingSpringJDBCModuleUsingXmlConfig.entity.Student;

public class StudentDaoRowMapper implements RowMapper<Student> {
	
	private ApplicationContext context; 
	
	public void setContext(ApplicationContext context) {
		this.context = context;
	}

	@Override
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
