package com.ecommerce.micrommerce.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.micrommerce.web.model.Product;

@RestController
public class ProductController {

    @GetMapping("/Produits")
    public String listeProduits() {
        return "tiens, v'la un pdt !";
    }

    @GetMapping("/Produits/{id}")
    public Product afficherUnProduits(@PathVariable int id) {
        //Product product = new Product(id, "Aspi", 120);
        return new Product(id, "Aspi", 120);
    }


}
