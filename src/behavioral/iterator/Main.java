package behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepository();

        for(Iterator iterator = customerRepository.getIterator(); iterator.hasNext();){
            // casting
            String customer = (String) iterator.next();
            System.out.println(customer);
        }
    }
}
