package com.example.CustomerProduct.Relationship.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String productname;
    public int price;
    public String productdescription;
    public String productcategory;
    public String productbrand;
    public int productquantity;
    public String productmanufacturedate;
    public String productexpirydate;
}
