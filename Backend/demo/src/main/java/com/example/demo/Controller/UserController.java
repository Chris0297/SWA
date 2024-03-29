package com.example.demo.Controller;

import com.example.demo.Interfaces.UserRepository;
import com.example.demo.Models.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserRepository user;

//    @Autowired
//    public UserController(UserRepository user){
//        this.user = user;
//    }

//    @GetMapping("/isadmin")
//    public List <UsersEntity> getAllAdmins(){
//        return user.findByIsAdminTrue();
//    }
//
//    @GetMapping("/isfalse")
//    public List <UsersEntity> getNoAdmins(){
//        return user.findByIsAdminFalse();
//    }


}



