package com.shimbhu.controller;

import com.shimbhu.model.User;
import com.shimbhu.model.UserInput;
import com.shimbhu.service.UserService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @MutationMapping(name = "addUser")
    public User addUser(@Argument(name = "user") UserInput user) {
        User user1 = new User();
        user1.setUserName(user.getUserName());
        user1.setCity(user.getCity());
        user1.setPhone(user.getPhone());
        return userService.addUser(user1);
    }

    @MutationMapping(name = "updateUser")
    public User updateUser(@Argument(name = "userId") Integer userId,@Argument(name = "user") UserInput user) {

        User user1 = new User();
        user1.setUserId(userId);
        user1.setUserName(user.getUserName());
        user1.setCity(user.getCity());
        user1.setPhone(user.getPhone());

        return userService.addUser(user1);
    }

    @QueryMapping(name = "getUser")
    public User getUser(@Argument(name = "userId") Integer userId) {
        return userService.getUser(userId);
    }

    @QueryMapping(name = "getAllUsers")
    public List<User> getAllUser() {
        return userService.getAllUsers();
    }





}
