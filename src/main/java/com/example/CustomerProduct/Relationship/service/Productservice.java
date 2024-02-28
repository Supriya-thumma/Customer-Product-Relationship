package com.example.CustomerProduct.Relationship.service;

import com.example.CustomerProduct.Relationship.model.Product;
import com.example.CustomerProduct.Relationship.repository.Productrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Productservice {
    @Autowired
    private Productrepository repo;
    public Product saveproduct(Product product) {
        return repo.save(product);
    }
}
