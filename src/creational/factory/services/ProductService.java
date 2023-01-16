package creational.factory.services;

import creational.factory.factories.ILoggerFactory;
import creational.factory.factories.LoggerFactory;
import creational.factory.logging.ILogger;

public class ProductService implements IProductService{

    private ILoggerFactory loggerFactory;
    private ILogger logger;

    public ProductService(ILoggerFactory loggerFactory) {
        this.loggerFactory =loggerFactory;
        logger = loggerFactory.createLogger();
    }

    @Override
    public void add() {
        logger.log("Product.Add worked...");
        System.out.println("Product added.");
    }
}
