package com.company.Entites.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity // Varlık
@Table(name="products") // Veritabanındaki products tablosunun karşılığı

public class Product {

    @Id
    @GeneratedValue
    @Column(name="product_id") // Veri tabanındaki Column Karşılığı
    private int id;

    @Column(name="category_id")
    private int categoryId;

    @Column(name="product_name")
    private String productName;

    @Column(name="unit_price")
    private double UnitPrice;

    @Column(name="units_in_stock")
    private short unitsInStock;

    @Column(name="quantity_per_unit")
    private String quantityPerUnit;

    public Product() {

    }

    public Product(int id, int categoryId, String productName, double unitPrice, short unitsInStock, String quantityPerUnit) {
        this.id = id;
        this.categoryId = categoryId;
        this.productName = productName;
        UnitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        this.quantityPerUnit = quantityPerUnit;


    }

}