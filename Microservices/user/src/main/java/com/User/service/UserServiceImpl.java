package com.User.service;

import com.User.entity.User;
import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements  UserService{


    public List<User> userList= Arrays.asList(
            new User(1201,"Pushkar","7017698597"),
            new User(1202,"Vandna","7017098507"),
            new User(1203,"Naman","7017698507"),
            new User(1204,"Ravi","7017698508"),
            new User(1205,"Meenu","7017698505")
    );



    @Override
    public List<User> getUser() {
        return userList;
    }

    @Override
    public User getUserById(int id) {

         return userList.stream().filter(user ->user.getUser_Id()==id).findAny().orElse(null);

    }
}
