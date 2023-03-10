package com.razataggarwal.eight_understandingSpringJDBCModuleUsingXmlConfig.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.razataggarwal.eight_understandingSpringJDBCModuleUsingXmlConfig.entity.Student;

public class StudentDaoImp implements StudentDao {
	 
	private JdbcTemplate jdbcTemplate;
	
	private StudentDaoRowMapper studentDaoRowMapper; 
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void setStudentDaoRowMapper(StudentDaoRowMapper studentDaoRowMapper) {
		this.studentDaoRowMapper = studentDaoRowMapper;
	}

	@Override
	@Transactional
	public int createStudent(Student student) throws SQLException {
		String sql ="insert into Student(name,city) values (?,?)";
		//business logic if any. 
		//using spring jdbc to update records in db. 
		int rows_inserted=0;
		rows_inserted=jdbcTemplate.update(sql,student.getName(),student.getCity());
		return rows_inserted; 
	}

	@Override
	@Transactional
	public int deleteStudentById(Long id) throws SQLException{
		String sql = "delete from student where id=?";
		int rows_deleted=this.jdbcTemplate.update(sql,id);
		return rows_deleted; 
	}

	@Override
	public List<Student> getAllStudents() throws SQLException{
		String sql = "Select * from Student";
		return this.jdbcTemplate.query(sql, studentDaoRowMapper);
	}

	@Override
	public Optional<Student> getStudentById(Long id) throws SQLException{
		String sql="select * from student where id=?";
		Student student=this.jdbcTemplate.queryForObject(sql, studentDaoRowMapper, id);
		return Optional.ofNullable(student);
	}

	@Override
	@Transactional
	public int updateStudentById(Long id, Student student) throws SQLException{
		String sql="update Student set name=?,city=? where id=?";
		int rows = this.jdbcTemplate.update(sql,student.getName(),student.getCity(),id);
		return rows; 
	}

}
