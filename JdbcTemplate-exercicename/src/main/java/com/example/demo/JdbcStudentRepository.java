package com.example.demo;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcStudentRepository implements StudentRepository {
	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public Iterable<Student> findAll() {
		return jdbc.query("select * from student where name= ?", this::mapRowToStudent);
	}
	
	@Override
	public Student findOne(String name) {
		return jdbc.queryForObject("select * from student where name = ?", this::mapRowToStudent, name);

	}
	
	@Override
	public Student save(Student student) {
		jdbc.update("insert into student values (?, ?, ?, ?)",
				student.getId(),
				student.getName(),
				student.getBirthDate(),
				student.getEmail());
				return student;

	}
	
	private Student mapRowToStudent(ResultSet rs, int rowNum) throws SQLException {
		return new Student(
				rs.getString("id"),
				rs.getString("name"),
				rs.getDate("birthDate"),
				rs.getString("email")
				);

	}



}
