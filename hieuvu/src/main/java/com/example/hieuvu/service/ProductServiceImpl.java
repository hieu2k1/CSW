package com.example.hieuvu.service;

import com.example.hieuvu.entity.Product;
import com.example.hieuvu.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepo productRepo;
    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product addProduct(Product p) {
        return productRepo.save(p);
    }

    @Override
    public Product sellProduct(int id, int q) {
        Product p = productRepo.findById(id).get();
        p.setQuantity(q);
        return productRepo.save(p);
    }
}