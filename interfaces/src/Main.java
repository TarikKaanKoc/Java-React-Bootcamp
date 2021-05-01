public class Main {
    public static void main(String[]args){

        Logger[] loggers = {new SmsLogger(),new EmailLogger(), new FileLogger()};

        CustomerManager customerManager = new CustomerManager(loggers);

        Customer tarik = new Customer("1","Tarik kaan","koc");
        customerManager.add(tarik);
    }
}
