package Abstract;

import Entities.Customer;

public interface GeneralCustomerService  {

    // Genel hepsini kapsayan
    void saveAll(Customer customer);
    void deleteAll(Customer customer);
    void updateAll(Customer customer);

    //Starbucks
    void saveStarbucks(Customer customer);
    void deleteStarbucks(Customer customer);
    void updateStarbucks(Customer customer);

    //Nero

    void saveNero(Customer customer);
    void deleteNero(Customer customer);
    void updateNero(Customer customer);


}
