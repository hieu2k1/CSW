package com.example.hieuvu.service;

import com.example.hieuvu.entity.Product;

import java.util.List;


public interface ProductService {
    List<Product> getAllProducts();
    Product addProduct(Product p);
    Product sellProduct(int id , int q);
}