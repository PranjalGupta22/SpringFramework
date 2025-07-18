package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao{
	
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insert(Student student) {
		// TODO Auto-generated method stub
		String query = "insert into student(studId,studName,studCity) values(?,?,?)";
		int result = jdbcTemplate.update(query,student.getStudId(),student.getStudName(),student.getCity());
		return result;
	}

	@Override
	public int update(Student student) {
		String query = "update student set studName = ? , studCity = ? where studId = ?";
		int result = this.jdbcTemplate.update(query,student.getStudName(),student.getCity(),student.getStudId());
		return result;
	}

	@Override
	public int delete(int studentId) {
		String query = "delete from student where studId = ?";
		int result = this.jdbcTemplate.update(query,studentId);
		//System.out.println("JdbcTemplate object: " + jdbcTemplate);
		//System.out.println("Student ID to delete: " + student.getStudId());
		//System.out.println("Delete Result: " + result);
		return result;
	}
	
	@Override
	public Student selectById(int studentId) {
		String query = "select * from student where studId = ?";
		//parent child relationship
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return student;
	}
	
	@Override
	public List<Student> selectAll() {
		String query = "select * from student";
		List<Student> list = this.jdbcTemplate.query(query, new RowMapperImpl());
		return list;
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	

	
	

}
