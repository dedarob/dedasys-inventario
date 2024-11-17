package com.inventory.dedasys.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_products")
    private Integer id;
    @Column(name = "code_products")
    private Integer productCode;
    @Column(name = "name_products")
    private String productName;
    @Column(name = "desc_products")
    private String productDescription;
    @Column(name = "selling_products")
    private String productSellingPrice;
    @Column(name = "bought_products")
    private String productBoughtPrice;
}
