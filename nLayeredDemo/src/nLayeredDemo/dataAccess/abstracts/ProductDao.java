package nLayeredDemo.dataAccess.abstracts;

import nLayeredDemo.entites.concretes.Product;

import java.util.List;

public interface ProductDao {

    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Product product);
    Product get(int id);
    List<Product> getAll();

}
