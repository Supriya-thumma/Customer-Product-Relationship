package com.example.CustomerProduct.Relationship.repository;

import com.example.CustomerProduct.Relationship.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Customerrepository extends JpaRepository<Customer,Integer> {
}
