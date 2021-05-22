package com.company.api.controllers;

import com.company.Entites.concretes.Product;
import com.company.bussines.abstracts.ProductSerivce;
import com.company.core.utilitis.results.DataResult;
import com.company.core.utilitis.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public DataResult<List<Product>> getAll(){
    return this.productSerivce.getAll();
    }


    @PostMapping("/add")
    public Result add(@RequestBody Product product){
        return this.productSerivce.add(product);
    }

    //notlar
    // istekler iki türlüdür. 1.) Bana veri ver
    // 2.) şu veriyi değiştir.

}
