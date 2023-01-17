package structural.facade;

import structural.facade.authorization.Authorization;
import structural.facade.authorization.IAuthorization;
import structural.facade.caching.ICaching;
import structural.facade.caching.RedisCaching;
import structural.facade.logging.FileLogger;
import structural.facade.logging.ILogger;

public class CrossCuttingConcernFacade {
    public ILogger logger;
    public ICaching caching;
    public IAuthorization authorization;

    public CrossCuttingConcernFacade() {
        // IoC, Factory Pattern
        logger = new FileLogger();
        caching = new RedisCaching();
        authorization = new Authorization();
    }
}
