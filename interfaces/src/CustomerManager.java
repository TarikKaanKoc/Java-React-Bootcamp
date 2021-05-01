import jdk.jshell.execution.Util;

public class CustomerManager {
    //localy - tightly coupled

    private Logger[] loggers;
    public CustomerManager(Logger[] loggers){
        this.loggers = loggers;
    }

    public void add(Customer customer){
        System.out.println("Müşetri Eklendi :"+ customer.getFirstName());
    Utils.runLoggers(loggers, customer.getFirstName());
     }

    public void delete(Customer customer){
        System.out.println("Müşetri Silindi :"+ customer.getFirstName());
        Utils.runLoggers(loggers,customer.getLastName());
    }
}
