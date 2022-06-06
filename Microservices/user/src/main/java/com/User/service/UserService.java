package com.User.service;

import com.User.entity.User;

import java.util.List;

public interface UserService {

    public List<User>getUser();
    public User getUserById(int id);
}
