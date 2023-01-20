package behavioral.dependency_injection;

public class Main {
    public static void main(String[] args) {
        // IoC Container, DI Container
        ICustomerService customerService = new CustomerService(new DatabaseLogger());
    }
}
