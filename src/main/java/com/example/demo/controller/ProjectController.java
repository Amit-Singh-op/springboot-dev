package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/api/v1/")
public class ProjectController {
    
    @Autowired
    ProductService productService;

    public ResponseEntity<Product> saveProduct(Product product){
        Product savedProduct=productService.savedProduct(product);
        return new ResponseEntity<Product>(savedProduct, HttpStatusCode.valueOf(201));
    }
}
