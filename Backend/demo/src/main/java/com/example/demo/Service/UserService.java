package com.example.demo.Service;

import com.example.demo.Interfaces.CustomerRepository;
import com.example.demo.Interfaces.UserRepository;
import com.example.demo.Models.CustomerEntity;
import com.example.demo.Models.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository repo;
    private UsersEntity user;
    @Autowired
    public UserService(UserRepository repo, UsersEntity user){
        this.repo = repo;
        this.user = user;
    }
    public void AddUser(){
        user.setFirstName("x");
        user.setLastName("cvv");
        user.setLoginName("cc");
        user.setToken(333);
        user.setEmail("Chff");
        user.setAdmin(false);
        user.setPhoneNumber1("0038/4");
        user.setPhoneNumber2("8898/");
        user.setFkCustomer(1L);


        repo.save(user);

    }
}
