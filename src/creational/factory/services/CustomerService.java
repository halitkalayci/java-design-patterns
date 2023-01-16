package creational.factory.services;

import creational.factory.LoggerFactory;
import creational.factory.logging.ILogger;
import creational.singleton.loggers.Logger;

public class CustomerService implements ICustomerService{
    private LoggerFactory loggerFactory;
    private ILogger logger;

    public CustomerService() {
        loggerFactory = new LoggerFactory();
        logger = loggerFactory.createLogger();
    }

    @Override
    public void add() {
        logger.log("Customer.Add worked..");
        System.out.println("Customer added.");
    }
}
