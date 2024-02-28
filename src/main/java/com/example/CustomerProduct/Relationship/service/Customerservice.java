package com.example.CustomerProduct.Relationship.service;

import com.example.CustomerProduct.Relationship.model.Customer;
import com.example.CustomerProduct.Relationship.repository.Customerrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class Customerservice {
    @Autowired
    private Customerrepository repo;
    public Customer addCustomer(Customer customer) {
        return repo.save(customer);
    }

    public Optional<Customer> getCustomer(int customerId) {
        return repo.findById(customerId);
    }

    public List<Customer> getAllCustomers() {
        return repo.findAll();
    }

    public String deleteCustomer(int customerId) {
        repo.deleteById(customerId);
        return "Customer deleted";
    }
}
