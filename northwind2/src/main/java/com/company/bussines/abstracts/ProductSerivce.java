package com.company.bussines.abstracts;

import com.company.Entites.concretes.Product;
import com.company.core.utilitis.results.DataResult;
import com.company.core.utilitis.results.Result;

import java.util.List;

public interface ProductSerivce {

    DataResult<List<Product>>  getAll();
    Result add(Product product);

}
