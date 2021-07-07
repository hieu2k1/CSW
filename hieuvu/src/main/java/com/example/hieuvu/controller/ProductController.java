package com.example.hieuvu.controller;

import com.example.hieuvu.entity.Product;
import com.example.hieuvu.model.BaseResponse;
import com.example.hieuvu.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/product")
public class ProductController {

    @Autowired
    ProductService productService;
    @GetMapping
    public BaseResponse getAllProduct(){
        BaseResponse res = new BaseResponse();
        res.data = productService.getAllProducts();
        return res;
    }
    @PostMapping
    public BaseResponse addProduct(@RequestBody Product product){
        BaseResponse res = new BaseResponse();
        res.data = productService.addProduct(product);
        return res;
    }

    @PutMapping("/{id}")
    public  BaseResponse sellProduct(@PathVariable int id, @RequestParam int quantity){
        BaseResponse res = new BaseResponse();
        res.data = productService.sellProduct(id, quantity);
        return res;
    }


}