package com.studentcrud.setter;

import org.springframework.stereotype.Component;

import com.studentcrud.dto.request.StudentRequestDto;
import com.studentcrud.entity.Student;

@Component
public class EntitySetter {

	public Student studentDtoToEntity (StudentRequestDto studentRequestDto) {
		return new Student (studentRequestDto.getId(),studentRequestDto.getName(),studentRequestDto.getAddress()
				,studentRequestDto.getDistric(),studentRequestDto.getState(),studentRequestDto.getMobNo());
	}
	
}
