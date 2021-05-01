public class Main {

    public static void main(String[] args) {
        // Java Basics  - Java temelleri

        System.out.println("Hello Java. :)");  //Print: Print out - Çıktı

        //Data Types - Veri tipleri

        int number = 54; // İnteger veriable - Tamsayı değişkeni
        double decimelNumber = 12.5; // decimal number variable - Ondalıklı sayı değişkeni

        char Character = 'D'; /*ASCİ CODE , Unicode standartlarında karakterlerin
        karşılıklarını tutan veri tipidir. */

        String City = "Ankara";  // metinsel değerleri bir string değişkeni içerisinde tutmaktayız

        int number1 = 20;
        // şart blokları
        if (number1 < 20) {
            System.out.println("sayi 20'den küçüktür"); // true

        } else if(number1==20){
            System.out.println("Sayı 20'ye eşittir.");
        }

        else System.out.println("sayi 20'den küçük değildir."); // false
  }
}
