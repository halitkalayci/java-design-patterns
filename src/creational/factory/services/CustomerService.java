package creational.factory.services;

import creational.factory.factories.ILoggerFactory;
import creational.factory.factories.LoggerFactory;
import creational.factory.logging.ILogger;

public class CustomerService implements ICustomerService{
    private ILoggerFactory loggerFactory;
    private ILogger logger;

    public CustomerService(ILoggerFactory _loggerFactory) {
        loggerFactory=_loggerFactory;
        logger = loggerFactory.createLogger();
    }

    @Override
    public void add() {
        logger.log("Customer.Add worked..");
        System.out.println("Customer added.");
    }
}
