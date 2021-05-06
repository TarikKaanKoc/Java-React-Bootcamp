package Console;

import Concrate.CustomerManager;
import Concrate.NeroCustomerManager;
import Concrate.StarbucksCustomerManager;
import Entities.Customer;

import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // 3 Müşteri oluşturma simülasyonu

        //1
      Customer customer = new Customer("Tarik","koc",new Date(2000,1,1) ,"12345678901");
       //2
      Customer customer1 = new Customer("Kaan","koc" , new Date(2000,2,2),"12345678901");
      //3
      Customer customer2 = new Customer("Abdulhakim","kaya" , new Date(2000,3,3),"12345678901");

        // Starbucks'a müşteri ekleme , güncelleme , silme Simülasyonu

        StarbucksCustomerManager starbucksCustomerManager = new StarbucksCustomerManager();
        starbucksCustomerManager.saveStarbucks(customer); // Kaydetme
        starbucksCustomerManager.updateStarbucks(customer); // güncelleme
        starbucksCustomerManager.deleteStarbucks(customer); //Silme

        System.out.println("*****************************");

        //  Nero'ya müşteri ekleme , güncelleme , silme Simülasyonu

        NeroCustomerManager neroCustomerManager = new NeroCustomerManager();
        neroCustomerManager.saveNero(customer1); // kaydetme
        neroCustomerManager.updateNero(customer1); // güncelleme
        neroCustomerManager.deleteNero(customer1); // silme

        System.out.println("*****************************");

        // Tüm mevcut cafelere ekleme

        CustomerManager customerManager = new CustomerManager();
        customerManager.saveAll(customer2);  // kaydetme
        customerManager.updateAll(customer2); // güncelleme
        customerManager.deleteAll(customer2); // Silme



    }
}
