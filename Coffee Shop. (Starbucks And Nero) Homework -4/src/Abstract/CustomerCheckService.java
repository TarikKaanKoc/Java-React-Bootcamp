package Abstract;

import Entities.Customer;

public interface CustomerCheckService {
    boolean checkIfRealPerson(Customer customer);
}
