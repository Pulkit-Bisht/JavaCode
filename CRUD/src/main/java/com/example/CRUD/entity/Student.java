package com.example.CRUD.entity;

public class Student {
    private int Id;
    private String Name;
    private String Fname;
    private String Mname;
    private String Cousrse;

    public Student(int id, String name, String fname, String mname, String cousrse) {
        Id = id;
        Name = name;
        Fname = fname;
        Mname = mname;
        Cousrse = cousrse;
    }

    public Student() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getMname() {
        return Mname;
    }

    public void setMname(String mname) {
        Mname = mname;
    }

    public String getCousrse() {
        return Cousrse;
    }

    public void setCousrse(String cousrse) {
        Cousrse = cousrse;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Fname='" + Fname + '\'' +
                ", Mname='" + Mname + '\'' +
                ", Cousrse='" + Cousrse + '\'' +
                '}';
    }
}
