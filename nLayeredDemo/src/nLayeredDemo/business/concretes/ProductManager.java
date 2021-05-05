package nLayeredDemo.business.concretes;

import nLayeredDemo.Core.LoggerService;
import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entites.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {

    private ProductDao productDao;
    private LoggerService loggerService;

    public ProductManager(ProductDao productDao, LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService = loggerService;
    }

    @Override
    public void add(Product product) {
        if(product.getCategoryId()==1){
            System.out.println("Bu kategoride ürün kabul edilmiyor.");
            return;
        }
        this.productDao.addProduct(product);
        this.loggerService.logToSystem("Ürün eklendi "+product.getProductName());
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
