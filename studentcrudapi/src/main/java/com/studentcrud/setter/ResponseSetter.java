package com.studentcrud.setter;

import org.springframework.stereotype.Component;

import com.studentcrud.dto.response.StudentResponseDto;
import com.studentcrud.entity.Student;

@Component
public class ResponseSetter {

	public StudentResponseDto StudentEntityToDto(Student student )
	{
		return new StudentResponseDto(student.getId(),student.getName()
				,student.getAddress(),student.getDistric(),student.getState(),student.getMobNo());
	}
	
}
