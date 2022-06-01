package com.map;
//import com.map.repository.StudentRepository;
//import com.map.model.Address;
//import com.map.model.Course;
//import com.map.repository.PersonRepository;
//import com.map.repository.CourseRepository;
import com.map.repository.EmployeeRepository;
import com.map.repository.ProjectsRepository;
import com.map.model.Employee;
import com.map.model.Projects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.map.repository.EmployeeRepository;
import com.map.repository.ProjectsRepository;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class App implements CommandLineRunner {

//    @Autowired StudentRepository ob;
//    @Autowired AddressRepository ob1;

//    @Autowired PersonRepository ob3;

//    @Autowired CourseRepository ob4;

    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    ProjectsRepository projectsRepository;
    public static void main(String[] args)
    {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {
//    Address address1 =new Address(1,"Kashipur","Manpur");
//    ob1.save(address1);
//    Address address2=new Address(2,"Kashipur","Manpur");
//    ob1.save(address2);
//    List<Address> addressList=Arrays.asList(address1,address2);
//    Student student=new Student(1,"Name","Father","Mother",addressList);
//    ob.save(student);

//        Person p1=new Person(1,"Pushkar","Bisht");
//        ob3.save(p1);
//        Course course1=new Course(101,"MCA",p1);
//
//        ob4.save(course1);
        Employee e1=new Employee();
        Employee e2=new Employee();
        e1.setId(1);
        e1.setName("Pushkar");
        employeeRepository.save(e1);

        e2.setId(2);
        e2.setName("Rahul");
        employeeRepository.save(e2);

        Projects p1=new Projects();
        Projects p2=new Projects();
//
        p1.setId(33);
        p1.setName("Student System");
//
        p2.setId(44);
        p2.setName("Android Beta");


        List<Employee>employeeList=new ArrayList<>();
        List<Projects>projectsList=new ArrayList<>();
//
        employeeList.add(e1);
        employeeList.add(e2);
//
        projectsList.add(p1);
        projectsList.add(p2);
//
        e1.setProjectsList(projectsList);
        projectsRepository.save(p1);
        p2.setEmployeeList(employeeList);
        projectsRepository.save(p2);






    }
}
