package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    public List<Product> getAllProducts() {

        return productRepo.findAll();

    }

    public Product saveProduct(Product product) {

        return productRepo.save(product);
    }
}
