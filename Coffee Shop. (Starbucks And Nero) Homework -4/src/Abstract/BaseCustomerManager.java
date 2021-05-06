package Abstract;

import Entities.Customer;

public class BaseCustomerManager implements GeneralCustomerService {
    @Override
    public void saveAll(Customer customer) {
        System.out.println(customer.getFirstName()+" "+customer.getLastName()+" "+"Adlı müşterinin bilgileri," +
                " tüm mevcut cafelere kaydedildi");
    }

    @Override
    public void deleteAll(Customer customer) {
        System.out.println(customer.getFirstName()+" "+customer.getLastName()+" "+"Adlı müşterinin bilgileri," +
                " tüm mevcut cafelerden silindi");
    }

    @Override
    public void updateAll(Customer customer) {
        System.out.println(customer.getFirstName()+" "+customer.getLastName()+" "+"Adlı müşterinin bilgileri," +
                " tüm mevcut cafelerde güncellendi");
    }

    @Override
    public void saveStarbucks(Customer customer) {
        System.out.println(customer.getFirstName()+" "+customer.getLastName()+" "+"Adlı müşterinin bilgileri," +
                " starbucks cafesine kaydedildi");
    }

    @Override
    public void deleteStarbucks(Customer customer) {
        System.out.println(customer.getFirstName()+" "+customer.getLastName()+" "+"Adlı müşterinin bilgileri," +
                " starbucks cafesinden silindi");
    }

    @Override
    public void updateStarbucks(Customer customer) {
        System.out.println(customer.getFirstName()+" "+customer.getLastName()+" "+"Adlı müşterinin bilgileri," +
                " starbucks cafesinde güncellendi ");
    }

    @Override
    public void saveNero(Customer customer) {
        System.out.println(customer.getFirstName()+" "+customer.getLastName()+" "+"Adlı müşterinin bilgileri," +
                " nero cafesine kaydedildi.");

    }

    @Override
    public void deleteNero(Customer customer) {
        System.out.println(customer.getFirstName()+" "+customer.getLastName()+" "+"Adlı müşterinin bilgileri," +
                " nero cafesinde silindi");
    }

    @Override
    public void updateNero(Customer customer) {
        System.out.println(customer.getFirstName()+" "+customer.getLastName()+" "+"Adlı müşterinin bilgileri," +
                " nero cafesinde güncellendi");
    }
}
