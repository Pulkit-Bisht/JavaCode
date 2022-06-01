package com.oodles.anotation;

import com.oodles.anotation.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

import java.util.List;

@SpringBootApplication
public class AnotationApplication {
	public static List<Student> students = new ArrayList<Student>();
	public static void main(String[] args) {

		SpringApplication.run(AnotationApplication.class, args);
		Student firstStudent=new Student();
		Student secondStudent=new Student();
		firstStudent.setStudentId(1);
		firstStudent.setStudentName("Narsingh");

		secondStudent.setStudentId(2);
		secondStudent.setStudentName("Tanuja");

		students.add(firstStudent);
		students.add(secondStudent);
	}


}
