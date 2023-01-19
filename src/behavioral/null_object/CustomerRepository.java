package behavioral.null_object;

public class CustomerRepository {
    public static final String[] customers = {"Halit","Candan","Andaç","Mina","Tolga","Helin","Furkan"};

    public static AbstractCustomer getCustomer(String name){
        for(int i=0; i<customers.length; i++){
            if(customers[i].equalsIgnoreCase(name)){
                RealCustomer customer = new RealCustomer();
                customer.name = name;
                return customer;
            }
        }
        return new NullCustomer();
    }
}
