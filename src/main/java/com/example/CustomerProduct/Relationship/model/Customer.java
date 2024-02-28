package com.example.CustomerProduct.Relationship.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="customer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int customerId;
    public String customerName;
    public String customerType;
    public String gender;
    public int age;
    public String email;
    public String address;
    public String phone;
    public String password;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id" , referencedColumnName = "id")
    public Product product;
}
