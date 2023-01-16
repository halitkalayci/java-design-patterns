package creational.abstract_factory.factories;

import creational.abstract_factory.caching.Caching;
import creational.abstract_factory.logging.Logging;

public abstract class CrossCuttingConcernFactory {
    public abstract Caching createCaching();
    public abstract Logging createLogging();
}
