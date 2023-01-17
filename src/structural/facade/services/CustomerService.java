package structural.facade.services;

import structural.facade.CrossCuttingConcernFacade;
import structural.facade.authorization.IAuthorization;
import structural.facade.caching.ICaching;
import structural.facade.logging.ILogger;

public class CustomerService implements ICustomerService{

    private CrossCuttingConcernFacade crossCuttingConcernFacade;

    public CustomerService(CrossCuttingConcernFacade crossCuttingConcernFacade) {
        this.crossCuttingConcernFacade = crossCuttingConcernFacade;
    }

    @Override
    public void add() {
        this.crossCuttingConcernFacade.authorization.authorize();
        this.crossCuttingConcernFacade.logger.log("Customer Add");
        this.crossCuttingConcernFacade.caching.cache("customer add method");
    }
}
