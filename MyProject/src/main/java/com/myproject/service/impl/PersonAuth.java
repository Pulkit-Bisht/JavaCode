package com.myproject.service.impl;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class PersonAuth implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if(username.equals("pushkar")){

            //If we have user class which we made then return their object otherwise
            //return predefined User class which import from spring security
//how to take data from database
            return new User("pushkar","1234",new ArrayList<>());
        }
        else {
            //If we use Exception then why we get error we already know exception is
            //super class of all class
            throw new UsernameNotFoundException("user not found");
        }
    }
}
