package com.shimbhu.service;

import com.shimbhu.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    public User addUser(User user);
    public User updateUser(User user);
    public User getUser(int userId);
    public void deleteUser(int userId);
    List<User> getAllUsers();
}
