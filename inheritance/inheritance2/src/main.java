public class main {
    public static void main(String[] args) {
        CustomerManager customerManager= new CustomerManager();
        customerManager.Add(new EmailLogger());
    }
}
