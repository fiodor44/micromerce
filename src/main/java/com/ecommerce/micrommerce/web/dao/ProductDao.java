package com.ecommerce.micrommerce.web.dao;

import com.ecommerce.micrommerce.model.Product;

import java.util.List;


public interface ProductDao {
    List<Product> findAll();
    Product findById(int id);
    Product save(Product product);
}