package creational.factory;

import creational.factory.logging.DatabaseLogger;
import creational.factory.logging.FileLogger;
import creational.factory.services.CustomerService;
import creational.factory.services.ICustomerService;
import creational.factory.services.IProductService;
import creational.factory.services.ProductService;

public class Main {
    public static void main(String[] args) {
        ICustomerService customerService = new CustomerService();
        customerService.add();

        IProductService productService = new ProductService();
        productService.add();
    }
}
