package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/api/v1/")
public class ProjectController {

    @Autowired
    ProductService productService;

    @PostMapping("saveProduct")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
        Product savedProduct = productService.savedProduct(product);
        return new ResponseEntity<Product>(savedProduct, HttpStatusCode.valueOf(201));
    }

    @GetMapping("allproducts")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> allProducts = productService.getAllProducts();
        return new ResponseEntity<>(allProducts, HttpStatusCode.valueOf(201));
    }
}
