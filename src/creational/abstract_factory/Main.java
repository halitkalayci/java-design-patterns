package creational.abstract_factory;

import creational.abstract_factory.factories.Factory1;
import creational.abstract_factory.factories.Factory2;
import creational.abstract_factory.services.CustomerService;
import creational.abstract_factory.services.ICustomerService;
import creational.abstract_factory.services.IProductService;
import creational.abstract_factory.services.ProductService;

public class Main {
    public static void main(String[] args) {
        ICustomerService customerService = new CustomerService(new Factory2());
        IProductService productService = new ProductService(new Factory1());

        customerService.add();
        productService.add();
    }
}
