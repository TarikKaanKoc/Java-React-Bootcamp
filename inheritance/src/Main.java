public class Main {

    public static void main(String[] args) {
        IndividualCustomer tarik= new IndividualCustomer();
        tarik.customerNumber="123";

        CorporateCustomer abdulhakim =new CorporateCustomer();
        abdulhakim.customerNumber="456";

        Customer[] customers= { tarik , abdulhakim };
        CustomerManager customerManager=new CustomerManager();
        customerManager.AddMultiple(customers);
    }
}
