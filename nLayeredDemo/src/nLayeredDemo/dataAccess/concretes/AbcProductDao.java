package nLayeredDemo.dataAccess.concretes;

import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entites.concretes.Product;

import java.util.List;

public class AbcProductDao implements ProductDao {
    @Override
    public void addProduct(Product product) {
        System.out.println("Abc ile eklendi " + product.getProductName());

    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public void deleteProduct(Product product) {

    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
