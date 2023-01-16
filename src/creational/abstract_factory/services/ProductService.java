package creational.abstract_factory.services;

import creational.abstract_factory.caching.Caching;
import creational.abstract_factory.factories.CrossCuttingConcernFactory;
import creational.abstract_factory.logging.Logging;

public class ProductService implements IProductService{

    private Logging logging;
    private Caching caching;

    public ProductService(CrossCuttingConcernFactory factory) {
        this.logging = factory.createLogging();
        this.caching = factory.createCaching();
    }

    @Override
    public void add() {
        logging.log("Product eklendi..");
        caching.cache("Product cache");
        // loglama ve cacheleme..
    }
}
