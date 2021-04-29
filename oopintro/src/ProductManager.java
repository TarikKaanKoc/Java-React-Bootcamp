public class ProductManager {
    public void addToCart(Product product) {
        System.out.println(product.name + " Sepete eklendi" );
    }

    public void getCategory(Category category) {
        System.out.println(category.name + " categorisini başarıyla getirdi");
    }
    public void saveProduct(Product product){
        System.out.println(product.name+" --> ürün kaydedildi");
    }

    //nesne         ---   koşul
    //class(object) ---   manager(yönetici)

    // OOP --> Object Oriented Programming(nesne yönelimli programlama)

    // --> örnekler <--
    // öğrenci  -  ders çalışır,
    // öğretmen -  ders anlatır


}
