package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

//    @GetMapping("/findAllUsers")
//    public List<User> findAllUsers() {
//        return this.userService.findAllUsers();
//    }

//    @PostMapping("/deleteUser")
//    public void deleteUserById(@RequestParam Integer id) {
//        this.userService.deleteUserById(id);
//    }

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user) {
        this.userService.insertUse(user);
    }

    @PostMapping("/updateUser")
    public void updateUser(@RequestBody User user) {
        this.userService.updateUser(user);
    }

}