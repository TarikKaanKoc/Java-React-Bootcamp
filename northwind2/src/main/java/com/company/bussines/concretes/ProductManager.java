package com.company.bussines.concretes;

import com.company.Entites.concretes.Product;
import com.company.bussines.abstracts.ProductSerivce;
import com.company.core.utilitis.results.DataResult;
import com.company.core.utilitis.results.Result;
import com.company.core.utilitis.results.SuccessDataResult;
import com.company.core.utilitis.results.SuccessResult;
import com.company.dataAccess.abstracts.ProdutDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Bu class service görevini görecek demektir.
public class ProductManager implements ProductSerivce {

    private ProdutDao productDao;

    @Autowired
    public ProductManager(ProdutDao productDao) {
        this.productDao = productDao;

    }

    @Override
    public DataResult<List<Product>> getAll() {
        return new SuccessDataResult<List<Product>>
                (this.productDao.findAll(),"Data Listelendi");

    }
    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessResult("Ürün Eklendi.");
    }
}

