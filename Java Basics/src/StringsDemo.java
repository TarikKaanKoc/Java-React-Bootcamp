import java.util.Locale;

public class StringsDemo {
    public static void main(String[] args){

        String mesaj = "Bugün hava çok güzel :D";
        System.out.println(mesaj);
    /*
        System.out.println("eleman sayisi : "+ mesaj.length()); //Length Dizinin eleman sayısını getirir
        System.out.println("1.Eleman : "+mesaj.charAt(0)); // Dizinin ( String dizidir ) sıfırıncı elemanı
        System.out.println(mesaj.concat(" Yaşasın")); // Ekstradan bir çıktı eklemek istersek: concat kullanırız
        System.out.println(mesaj.startsWith("B")); // b ile başlıyor mu?  : Başlıyorsa True döndürür
        System.out.println(mesaj.endsWith("D")); // D ile bitiyor mu? : Bitiyorsa True döndürür.

        System.out.println("**************");

        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);    */

        String yemiMesaj = mesaj.replace(" ","+"); // Yeni string

        System.out.println("**************");

        System.out.println(mesaj.substring(6)); //Altıncı indexkten itibaren çıktı ver (6.index dahil değil.)

        System.out.println("**************");

        System.out.println(mesaj.substring(6,10)); //Altıncı indexkten itibaren çıktı ver (6. ve 10.index dahil değil.)

        System.out.println("**************");

        for(String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }

        System.out.println("**************");

        System.out.println(mesaj.toLowerCase(Locale.ROOT)); // hepsini küçük harf yazdırma

        System.out.println(mesaj.toUpperCase(Locale.ROOT)); // hepsini büyük harf yazdırma

        System.out.println(mesaj.trim()); // mesajın sonunda veya başında  boşluk varsa hepsini siler
    }
}
