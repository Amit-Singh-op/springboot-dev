package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepo;
import com.example.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepo productRepo;

    @Override
    public Product savedProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

}
