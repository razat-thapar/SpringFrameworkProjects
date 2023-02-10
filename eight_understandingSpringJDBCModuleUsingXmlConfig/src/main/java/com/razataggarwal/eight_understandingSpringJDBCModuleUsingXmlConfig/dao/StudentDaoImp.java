package com.razataggarwal.eight_understandingSpringJDBCModuleUsingXmlConfig.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;

import com.razataggarwal.eight_understandingSpringJDBCModuleUsingXmlConfig.entity.Student;

public class StudentDaoImp implements StudentDao {
	 
	private JdbcTemplate jdbcTemplate; 
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int createStudent(Student student) throws SQLException {
		String sql ="insert into Student(name,city) values (?,?)";
		//business logic if any. 
		//using spring jdbc to update records in db. 
		int rows_inserted=0;
		rows_inserted=jdbcTemplate.update(sql,student.getName(),student.getCity());
		return rows_inserted; 
	}

	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Student> getStudentById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<Student> updateStudentById(Long id, Student student) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
