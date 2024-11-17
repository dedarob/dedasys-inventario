package com.inventory.dedasys.repositories;

import com.inventory.dedasys.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepositories extends CrudRepository<Product, Integer> {

}

