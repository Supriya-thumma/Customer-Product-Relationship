package com.example.CustomerProduct.Relationship.repository;

import com.example.CustomerProduct.Relationship.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Productrepository extends JpaRepository<Product,Long> {
}
