package structural.facade;

import structural.facade.services.CustomerService;
import structural.facade.services.ICustomerService;

public class Main {
    public static void main(String[] args) {
        ICustomerService customerService = new CustomerService(new CrossCuttingConcernFacade());
        customerService.add();
    }
}
