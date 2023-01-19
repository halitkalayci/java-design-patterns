package behavioral.null_object;

public class Main {
    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerRepository.getCustomer("Andaç");
        AbstractCustomer customer2 = CustomerRepository.getCustomer("İrem");
        AbstractCustomer customer3 = CustomerRepository.getCustomer("Halit");

        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
    }
}
