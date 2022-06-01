package com.oodles.anotation.controller;


import com.oodles.anotation.AnotationApplication;
import com.oodles.anotation.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @RequestMapping("/")
    public String check(){
        return "Hlo i am okk";
    }

    @RequestMapping(value = "/student",method = RequestMethod.GET)
    public List<Student> studentList(){
        return AnotationApplication.students;
    }


    @RequestMapping(value = "/addstudent",method = RequestMethod.POST)
    public String addStudent(
        @RequestParam(value = "studentId") int studentId,
                @RequestParam(value = "studentName") String studentName){
        Student student=new Student(studentId,studentName);
        AnotationApplication.students.add(student);
        return "{\"response\":\"success adding a student data\"}";
    }

    @RequestMapping(value = "/editstudent",method = RequestMethod.PUT)
    public List<Student> editStudent(@RequestBody Student student){
        AnotationApplication.students.set(0,student);
        return AnotationApplication.students;
    }

    @RequestMapping(value = "deleteStudent",method = RequestMethod.DELETE)
    public List<Student> deleteStudent(@PathVariable int index){
        AnotationApplication.students.remove(index);
        return AnotationApplication.students;
    }

}
