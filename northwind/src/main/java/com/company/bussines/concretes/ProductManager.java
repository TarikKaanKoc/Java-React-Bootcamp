package com.company.bussines.concretes;

import com.company.Entites.concretes.Product;
import com.company.bussines.abstracts.ProductSerivce;
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
    public List<Product> getAll() {
        return this.productDao.findAll();
    }
}

