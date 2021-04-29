package com.company;

public class Main {

    public static void main(String[] args) {

        //  İntellisense = Ctrl + space yaptığımızda, açılır kutuya denir.

        String internetSubeButonu = "İnternet Şubesi";
        System.out.println("Hello World");

        /*Notlar:
        --------------------------------------------------------------------------------
                Java da önce veri türü sonra ismi yazılır.
               Değişken isimlendirmelerinde camelCase kullanılır.
        camelCase => İlk kelimenin ilk harfi küçük sonraki kelimelerin ilk harfi büyük olucak sekilde
        yazılır.
    Üstteki kodda bir değişken tanımladık ve veri türünü String olarak belirledik çünkü verimiz bir metinsel ifade .
    İsmini ise internetSubeButonu olarak verdik ve bu butonun değerini yani veriyi "İnternet Şubesi" olarak yazdık.
    Artık bu butonu yazdırmaya çalıstırdığımızda;
    System.out.println(internetSubeButonu) ; olarak yazarız.
    Çıktı olarak Console da İnternet Şubesi yazar.*/

        //*** D.R.Y = Don't  repeat yourself =>  Bu ilke kendimizi tekrar etmemek icin kullanılır.
        //*** Örneğin => İnternet Şubesi. Yazısını bir değişken olmadan tutarsak her sayfaya yazmamız gerekir.

        /*ancak değişkenle tuttuğumuzda sadece  tek bir yerden o yazıyı değistirebiliriz.
    Mesela banka yönetimi ileride bu butonun ismini baska bir sey yapmak istesin "İnternet şubesine gir "
    olarak yapılmasını istediğinde her sayfaya gidip bunu yazmamak icin bunu bir değişken üzerinde tutarız.
         */
        //--------------------------------------------------------------------------------

        // Date Types

        double dolarDun=8.15;
        double dolarBugun=8.20;
        // Double = Ondalıklı sayılar için kullanılır.


        int vade2 = 36;  // int = Tam sayı için kullanılır. ( integer )

        boolean dustuMu=false; // boolean = Mantıksal durumları tuttuğumuz veri türüdür.
        //Misal:Doların çıktığı, düştüğü ya da  eşit olma durumları vardır. Bu doların dünkü ve bugünkü değerine göre belirlenir.


        //*** İF / ELSE USE OF

        if(dolarBugun<dolarDun){
            System.out.println("Dolar düştü resmi"); // İlk süslü parantezler arasına, şart doğru ise yapılacak işlemler yazılır.
        }
        else System.out.println("Dolar yükseldi resmi"); // şart yanlış ise yapılacak işlemler yazılır.
        //--------------------------------------------------------------------------------

        //  dolarDun ve dolarBugun'un eşit olma olasılığı da mevcut.

        // Örneğin !

        double dolarDun=8.15;
        double dolarBugun=8.15;

        if(dolarBugun<dolarDun){
            System.out.println("Dolar düştü resmi");
        }

        /*Eğer 1. Şart sağlanmıyorsa,  sırayla else if bloklarına bakılacak ve gerçekleşen
         *  bir şart varsa o bloktaki işlemler yapılacak.*/

        else if(dolarBugun>dolarDun){
            System.out.println("Dolar yükseldi resmi");
        }

        else System.out.println("Dolar yükseldi resmi"); //Yazacağımız kodlar bir satırdan fazla ise mutlaka süslü parantezler arasına almalıyız.
        // 1 Satırdan fazla değilse süslü parantez açmamıza gerek yoktur ! .

        //--------------------------------------------------------------------------------

        //*** Arrays - Diziler

        String[] krediler=
                {       "Hızlı kredi",
                        "Mutlu emekli kredisi",
                        "Konut kredi",
                        "Çiftçi kredi",
                        "Msb kredi",
                        "Meb kredi"
                };
        /*Javada köşeli parantez görüyorsak, belirtilen veri tipinde birden fazla veri bulunduğu anlamnına gelir.
         Ayrıca liste olduğundan dolayı çoğul olarak tutulur.  */


        //*** Foreach

        //foreach döngüsü : Krediler dizisindeki elemanları tek tek gezer.
        //işlem bitene kadar ( yani:  tüm elemanları gösterene kadar. ) devam eder.

        for(String kredi:krediler){
            System.out.println(kredi);
        }
        //--------------------------------------------------------------------------------

        // For
        /*int i = 0; Burası bir sayaç gibi ve biz 0 dan baslamasını belirtiyoruz. Bu kısm start kısmı denilebilir.
        i<krediler.length; Kısmında şartın yazıldığı yerdir.
        i++ Bu kısım ise i yi bir bir artır anlamındadır. ( i=+i'da denilebilir. İkiside bir bir artır demektir. )
        i'yi sıfırdan başlatmamızın nedeni birçok dil saymaya sıfırdan başlar. index 0'dır.*/

        for (int i = 0; i<krediler.length;i=+i){
            System.out.println(krediler[i]);
        }


        //--------------------------------------------------------------------------------
        //  Value Types - Değer Tipler : Sayısal veri tipleridir genellikle ; int,double,float,boolean vb...

        int sayi1=10;
        int sayi2=20;
        sayi1 = sayi2;
        sayi2 = 100;

        System.out.println(sayi1);

        int[] sayilar1={1,2,3,4,5};
        int[] sayilar2={10,20,30,40,50};

        sayilar1=sayilar2;
        sayilar2[0]=100;
        System.out.println(sayilar1[0]);

     /* Bellekte iki tane kısım vardır. Veri tiplerindeki değişkenleri tutmak için Bunlardan biri Stack diğeri Heaptir.
     Değer tipler Stack de kısmında çalışırlar ve sadece atamalar değeri üzerinden yapılıyor.*/
        //--------------------------------------------------------------------------------

// Referans tipler ( referance type ) : Diziler ,classlar, interfaceler, abstract classlar gibi yapılar referans tiptir.
// Array'lerin yani dizilerin sayısal ya da metinsel ifade olmasının hicbir önemi yoktur.
// Arrayler sayısal bir array  bile olsa referans tiptir.

        int[] sayilar1={1,2,3,4,5};
        int[] sayilar2={10,20,30,40,50};

        sayilar1=sayilar2;
        sayilar2[0]=100;
        System.out.println(sayilar1[0]);

        int[] sayilar1={1,2,3,4,5};
        int[] sayilar2={10,20,30,40,50};

        //Değer tiplerde değeri direkt atayabiliyorduk.
        // Referans tiplerde ise  sayilar 1 = sayilar2 yapıldığında ; Sayilar 1'in adresi = Sayilar 2'nin adresi oluyor.

        //--------------------------------------------------------------------------------
// Örnek 2 :
        String  sehir1 ="Ankara";
        String sehir2 ="İstanbul";
        sehir1 =sehir2;
        sehir2="İzmir";
        System.out.println(sehir1);

     /*Stringler referans tip olmasına rağmen burada cıktı olarak İstanbul olur.
      çünkü String yapılar bir istisna olarak değer tip gibi  çalışıyor.*/


    }

    }
}
