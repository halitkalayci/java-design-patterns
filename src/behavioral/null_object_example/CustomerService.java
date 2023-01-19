package behavioral.null_object_example;

public class CustomerService implements ICustomerService{
    private ILogger logger;

    public CustomerService(ILogger logger) {
        this.logger = logger;
    }

    @Override
    public void add() {
        logger.log("Customer Ekleme Loglandı..");
        System.out.println("Customer eklendi..");
    }

}
