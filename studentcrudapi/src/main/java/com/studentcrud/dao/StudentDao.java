package com.studentcrud.dao;

import java.util.List;

import com.studentcrud.entity.Student;

public interface StudentDao {

	boolean addStudent(Student student);

	boolean updateStudent(Student student);

	List<Student> getAllStudent();

	Student getStudentById(Integer id);
	
	

}
