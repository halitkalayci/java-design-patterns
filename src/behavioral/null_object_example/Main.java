package behavioral.null_object_example;

public class Main {
    public static void main(String[] args) {
        ICustomerService customerService1 = new CustomerService(new DatabaseLogger());
        customerService1.add();


        ICustomerService customerService2 = new CustomerService(new StubLogger());
        customerService2.add();
    }
}
