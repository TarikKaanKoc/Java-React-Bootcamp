public class Product {

        // constructor - Yapıcı
        // 1 constructor çalışmak zorunda, bu yapıda birden fazla constructor var yalnızca  1'i çalışıyor !
        // this --> ilgili class ( bu class'taki demek.)
        // final, sadece constructor'da set edilebilir demek.

         int id;
         String name;
         double unitPrice;
         String detail;
         public Product() {
            System.out.println("Böyle bir ürün bulunamadı");
        }
    public Product(String a) {
        System.out.println("Girdiğini id değeri = "+a);
    }
        public Product(int id, String name, double unitPrice,String detail){

            this.id = id;
            this.name = name;
            this.unitPrice = unitPrice;
            this.detail = detail;
    }
}
