package com.razataggarwal.nine_understandingSpringJDBCModuleUsingJavaConfig.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import com.razataggarwal.nine_understandingSpringJDBCModuleUsingJavaConfig.entity.Student;

public interface StudentDao {
	
	public abstract int createStudent(Student student) throws SQLException;
	public abstract int deleteStudentById(Long id) throws SQLException ;
	public abstract List<Student> getAllStudents() throws SQLException;
	public abstract Optional<Student> getStudentById(Long id) throws SQLException;
	public abstract int updateStudentById(Long id, Student student) throws SQLException;

}
