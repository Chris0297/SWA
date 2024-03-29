package com.example.demo.Service;

import com.example.demo.Interfaces.CustomerRepository;
import com.example.demo.Models.CustomerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository repo;
    private CustomerEntity customer;
    @Autowired
    public CustomerService(CustomerRepository repo, CustomerEntity customer){
        this.repo = repo;
        this.customer = customer;
    }
    public void AddCustomer(){
        customer.setName("Chris");
        customer.setCountry("Germany");
        customer.setTown("Reichenbach");
        customer.setStreet("Bis");
        customer.setZipCode("73833");
        customer.setDepartment("ff");

        repo.save(customer);

    }
}
