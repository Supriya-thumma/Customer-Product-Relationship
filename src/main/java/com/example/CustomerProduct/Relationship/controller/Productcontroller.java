package com.example.CustomerProduct.Relationship.controller;

import com.example.CustomerProduct.Relationship.model.Product;
import com.example.CustomerProduct.Relationship.service.Productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class Productcontroller {
    @Autowired
    private Productservice productservice;
    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product){
        return productservice.saveproduct(product);
    }
}
