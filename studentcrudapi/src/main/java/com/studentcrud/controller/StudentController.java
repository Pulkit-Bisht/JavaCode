package com.studentcrud.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.studentcrud.dto.request.StudentRequestDto;
import com.studentcrud.dto.response.CustomResponse;
import com.studentcrud.service.StudentService;


@RestController
@RequestMapping(value = "student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/addStudent")
	public ResponseEntity<?> addStudent(@RequestBody StudentRequestDto studentRequestDto){
		CustomResponse response=studentService.addStudent(studentRequestDto);	
		
		 return ResponseEntity.ok(response);
	}
	
	
	@PutMapping("/updateStudent")
	public ResponseEntity<?> updateStudent(@RequestBody StudentRequestDto studentRequestDto){
		CustomResponse response=studentService.updateStudent(studentRequestDto);
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/getAllStudent")
	public ResponseEntity<?> getAllStudent(){
		CustomResponse response=studentService.getAllStudent();
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("getStudentById/{studentId}")
	public ResponseEntity<?> getStudentById(@PathVariable Integer studentId,HttpServletRequest request){
		CustomResponse response=studentService.getStudentById(studentId);
		return ResponseEntity.ok(response);
	}
}
