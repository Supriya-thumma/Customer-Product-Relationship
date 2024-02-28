package com.example.CustomerProduct.Relationship.controller;

import com.example.CustomerProduct.Relationship.model.Customer;
import com.example.CustomerProduct.Relationship.service.Customerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class Customercontroller {
    @Autowired
    private Customerservice customerservice;
    @PostMapping("/add")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerservice.addCustomer(customer);
    }
    @GetMapping("/get/{customerId}")
    public Optional<Customer> getCustomer(@PathVariable int customerId){
        return customerservice.getCustomer(customerId);
    }
    @GetMapping("/getall")
    public List<Customer> getAllCustomers(){
        return customerservice.getAllCustomers();
    }
    @DeleteMapping("/delete/{customerId}")
    public String deleteCustomer(@PathVariable int customerId){
        return customerservice.deleteCustomer(customerId);
    }
}
