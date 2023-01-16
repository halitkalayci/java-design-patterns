package creational.factory.services;

import creational.factory.LoggerFactory;
import creational.factory.logging.ILogger;

public class ProductService implements IProductService{

    private ILogger logger;

    public ProductService() {
        LoggerFactory loggerFactory = new LoggerFactory();
        logger = loggerFactory.createLogger();
    }

    @Override
    public void add() {
        logger.log("Product.Add worked...");
        System.out.println("Product added.");
    }
}
