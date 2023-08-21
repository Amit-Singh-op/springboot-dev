package com.example.demo.entity;

import java.math.BigInteger;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    private BigInteger id;
    private String produtName;
}
