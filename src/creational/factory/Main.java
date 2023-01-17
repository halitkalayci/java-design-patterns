package creational.factory;

import creational.factory.factories.LoggerFactory;
import creational.factory.factories.LoggerFactory2;
import creational.factory.logging.DatabaseLogger;
import creational.factory.logging.FileLogger;
import creational.factory.services.CustomerService;
import creational.factory.services.ICustomerService;
import creational.factory.services.IProductService;
import creational.factory.services.ProductService;

public class Main {
    public static void main(String[] args) {
        ICustomerService customerService = new CustomerService(new LoggerFactory());
        customerService.add();

        IProductService productService = new ProductService(new LoggerFactory2());
        productService.add();
    }
}
