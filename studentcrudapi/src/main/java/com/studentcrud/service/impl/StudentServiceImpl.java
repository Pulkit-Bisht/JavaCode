package com.studentcrud.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;


import com.studentcrud.dao.StudentDao;
import com.studentcrud.dto.request.StudentRequestDto;
import com.studentcrud.dto.response.CustomResponse;
import com.studentcrud.dto.response.StudentResponseDto;
import com.studentcrud.entity.Student;
import com.studentcrud.service.StudentService;
import com.studentcrud.setter.EntitySetter;
import com.studentcrud.setter.ResponseSetter;


@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Autowired
	private EntitySetter entitySetter;
	
	@Autowired
	private ResponseSetter responseSetter;
	
	@Override
	public CustomResponse addStudent(StudentRequestDto studentRequestDto) {
		
		Student student=entitySetter.studentDtoToEntity(studentRequestDto);
		studentDao.addStudent(student);
		return new CustomResponse(HttpStatus.OK.value(), student, "saved successfully!");
	}

	@Override
	public CustomResponse updateStudent(StudentRequestDto studentRequestDto) {
		Student student =entitySetter.studentDtoToEntity(studentRequestDto);
		studentDao.updateStudent(student);
		return null;
	}
	
	@Override
	public CustomResponse getAllStudent() {
		List<Student>allStudent=studentDao.getAllStudent();
		ArrayList<StudentResponseDto>studentResponseDtoList  = new ArrayList<>();
		for(Student student : allStudent)
		{
			StudentResponseDto studentEntityToDto = responseSetter.StudentEntityToDto(student);
			studentResponseDtoList.add(studentEntityToDto);
		}
		return new CustomResponse(HttpStatus.OK.value(),studentResponseDtoList
				,"getAll student succesfully!",null,studentResponseDtoList.size());
	}

	@Override
	public CustomResponse getStudentById(Integer id) {
		try {
			Student studentId=studentDao.getStudentById(id);
			if(studentId==null)
			{
				return new CustomResponse(HttpStatus.BAD_REQUEST.value(),
				    	"customer does not exist",HttpStatus.BAD_REQUEST.toString());
			}
			StudentResponseDto studentInfo = responseSetter.StudentEntityToDto(studentId);
		       return new CustomResponse(HttpStatus.OK.value(),studentInfo,"customer get successfully");
		}
		catch (Exception e) {
			e.printStackTrace();
			return new CustomResponse(HttpStatus.BAD_REQUEST.value(),null,"does not exist");
		}
		
	}
	
}
