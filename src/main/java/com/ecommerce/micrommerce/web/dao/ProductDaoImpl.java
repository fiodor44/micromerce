package com.ecommerce.micrommerce.web.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ecommerce.micrommerce.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
    private static List<Product> listProduct = new ArrayList<>();
    static {
        listProduct.add(new Product(1 , "Ordinateur portable", 350, 100));
        listProduct.add(new Product(2 , "Aspirateur Robot", 500, 300));
        listProduct.add(new Product(3 , "Table de pingpong", 750, 400));
    }


    @Override
    public List<Product> findAll() {
    return listProduct;
    }

    @Override
    public Product findById(int id) {
        for (Product product : listProduct) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public Product save(Product product) {
        listProduct.add(product);
        return product;
    }
}
