package com.inventory.dedasys.controllers;

import com.inventory.dedasys.models.Product;
import com.inventory.dedasys.repositories.ProductRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/products")
public class ProductControllers {
    @Autowired
    private ProductRepositories productRepositories;

    @GetMapping
    public ResponseEntity<List<Product>> listProduct(){
        List<Product> list = (List<Product>) productRepositories.findAll();
        return ResponseEntity.status(200).body(list);
    }
}
