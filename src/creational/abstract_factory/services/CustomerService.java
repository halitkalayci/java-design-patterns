package creational.abstract_factory.services;

import creational.abstract_factory.caching.Caching;
import creational.abstract_factory.factories.CrossCuttingConcernFactory;
import creational.abstract_factory.logging.Logging;

public class CustomerService implements ICustomerService{

    private Caching caching;
    private Logging logging;

    public CustomerService(CrossCuttingConcernFactory factory) {
        caching = factory.createCaching();
        logging = factory.createLogging();
    }

    @Override
    public void add() {
        logging.log("Customer eklendi.");
        caching.cache("Customer cache.");
    }
}
