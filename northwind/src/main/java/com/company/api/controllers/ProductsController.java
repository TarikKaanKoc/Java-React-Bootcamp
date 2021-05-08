package com.company.api.controllers;

import com.company.Entites.concretes.Product;
import com.company.bussines.abstracts.ProductSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Sen bir controller'sın ( birden fazla controller olabilir. )
@RequestMapping("/api/products") // Dış dünyadan bir istek gelirse bu controller çalışacak.
public class ProductsController {

    private ProductSerivce productSerivce;


    @Autowired // Newliyor. arka planda
    public ProductsController(ProductSerivce productSerivce) {
        this.productSerivce = productSerivce;
    }




   @GetMapping("/getall") // misal sitede getAll diye bir istekte bulunsak : Bu api çalışır.
    public List<Product> getAll(){
    return this.productSerivce.getAll();
    }

    //notlar
    // istekler iki türlüdür. 1.) Bana veri ver
    // 2.) şu veriyi değiştir.

}
