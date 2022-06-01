package com.example.CRUD.controller;

import com.example.CRUD.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @GetMapping("/home")
    public  String home(){
        return "Welcome to Home Page";
    }
    @GetMapping("/data")
    public List<Student> getData(){

    }
}
