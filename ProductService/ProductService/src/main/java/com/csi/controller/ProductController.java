package com.csi.controller;

import com.csi.model.Product;
import com.csi.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductServiceImpl productServiceImpl;

    @PostMapping("/")
    public Product saveData(@RequestBody Product product){
        return productServiceImpl.saveData(product);
    }

    @GetMapping("/{productId}")
    public Optional<Product> getDataById(@PathVariable int productId){
        return productServiceImpl.getDataById(productId);
    }
}
