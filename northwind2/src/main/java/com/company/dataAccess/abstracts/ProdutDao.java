package com.company.dataAccess.abstracts;

import com.company.Entites.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutDao extends JpaRepository <Product, Integer > {


}
