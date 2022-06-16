package com.csi.service;

import com.csi.dao.ProductDaoImpl;
import com.csi.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl {

    @Autowired
    ProductDaoImpl productDaoImpl;


    public Product saveData(Product product) {
        return productDaoImpl.saveData(product);
    }

    public Optional<Product> getDataById(int productId) {
        return productDaoImpl.getDataById(productId);
    }
}
