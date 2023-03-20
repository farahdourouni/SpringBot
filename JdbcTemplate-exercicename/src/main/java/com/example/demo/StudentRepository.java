package com.example.demo;

public interface StudentRepository {
	Iterable<Student> findAll();
	Student findOne(String name);
	Student save(Student student);
}
