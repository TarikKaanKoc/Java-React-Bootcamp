package com.company.Entites.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity // Varlık
@AllArgsConstructor //Parametreli constructor
@NoArgsConstructor // Parametresiz contructor 
@Table(name="products") // Veritabanındaki products tablosunun karşılığı

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

}