package creational.abstract_factory.factories;

import creational.abstract_factory.caching.Caching;
import creational.abstract_factory.caching.InMemoryCaching;
import creational.abstract_factory.caching.RedisCaching;
import creational.abstract_factory.logging.DatabaseLogging;
import creational.abstract_factory.logging.Logging;

public class Factory2 extends CrossCuttingConcernFactory{
    @Override
    public Caching createCaching()
    {
        return new RedisCaching();
    }

    @Override
    public Logging createLogging()
    {
        return new DatabaseLogging();
    }
}
