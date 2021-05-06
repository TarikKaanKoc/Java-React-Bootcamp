package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import MernisService.AQUKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {


    @Override
    public boolean checkIfRealPerson(Customer customer) {


        AQUKPSPublicSoap publicSoap = new AQUKPSPublicSoap();

        try {
            return publicSoap.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()), customer.getFirstName().toUpperCase(),
                    customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
