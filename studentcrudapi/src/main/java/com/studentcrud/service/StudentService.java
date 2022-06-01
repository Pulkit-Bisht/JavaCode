package com.studentcrud.service;

import com.studentcrud.dto.request.StudentRequestDto;
import com.studentcrud.dto.response.CustomResponse;

public interface StudentService {

	CustomResponse addStudent(StudentRequestDto studentRequestDto);

	CustomResponse updateStudent(StudentRequestDto studentRequestDto);

	CustomResponse getAllStudent();

	CustomResponse getStudentById(Integer id);
	
	
	
}
