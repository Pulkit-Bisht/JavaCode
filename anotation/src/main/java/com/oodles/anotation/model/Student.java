package com.oodles.anotation.model;

import net.bytebuddy.implementation.bytecode.assign.TypeCasting;

public class Student {
    private int studentId;
    private  String studentName;

    public Student(int studentId, String studentName){
        this.studentId=studentId;
        this.studentName=studentName;
    }
    public Student(){

    }
    public int getStudentId(){
        return studentId;
    }
    public void setStudentId(int studentId){
        this.studentId=studentId;
    }
    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String studentName){
        this.studentName=studentName;
    }


    /*
    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Student() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

     */

}
