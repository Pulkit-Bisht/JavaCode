package com.User.Controller;

import com.User.entity.User;
import com.User.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class UserController {

 @Autowired
    private UserServiceImpl userService;
@Autowired
private RestTemplate restTemplate;
 @GetMapping("/users")
    public List<User> getUser(){
     return this.userService.getUser();
 }
 @GetMapping("user/{id}")
    public User myUser(@PathVariable("id") int id){

     User user=userService.getUserById(id);
//     http://localhost:8090/contact/1201
     List contacts=this.restTemplate.getForObject("http://contact-service/contact/"+user.getUser_Id(),List.class);
    user.setContact(contacts);
     return user;
 }

}
