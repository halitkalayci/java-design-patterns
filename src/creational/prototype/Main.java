package creational.prototype;

public class Main {
    public static void main(String[] args) {
        Customer cust1 = new Customer();
        cust1.id = 1;
        cust1.firstName ="Halit";
        cust1.lastName = "Kalaycı";
        cust1.customerNumber = 123;

        // casting
        Customer cust2 = (Customer) cust1.clone();



        System.out.println(cust2.id);
    }
}
