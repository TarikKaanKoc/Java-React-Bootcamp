package Console;

import nLayeredDemo.Core.JLoggerManagerAdapter;
import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entites.concretes.Product;

public class Main {

    public static void main(String[] args) {

        //ToDo : Spring IOC İle çözülecek. // İnteface'ler somut sınıfları tutabilir. Bu yüzden referans ettik.
        ProductService productService = new ProductManager(new AbcProductDao()
        , new JLoggerManagerAdapter());

        Product product = new Product(1,2,"elma",12,50);
        productService.add(product);


    }
}
