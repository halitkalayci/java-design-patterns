package creational.prototype;

public class Customer extends Person{
    public int customerNumber;
    private int age;

    public Customer(){
    }
    public Customer(Customer customer){
        super(customer);
        if(customer!=null){
            customerNumber=customer.customerNumber;
            age = customer.age;
        }
    }

    public int getAge() {
        return age;
    }

    @Override
    public Person clone() {
        return new Customer(this);
    }
}
