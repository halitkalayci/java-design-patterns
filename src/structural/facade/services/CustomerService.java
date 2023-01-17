package structural.facade.services;

import structural.facade.CrossCuttingConcernFacade;


public class CustomerService implements ICustomerService{


    // DI (Dependency Injection) HELL , Constructor HELL
    CrossCuttingConcernFacade crossCuttingConcernFacade;
    public CustomerService(CrossCuttingConcernFacade crossCuttingConcernFacade) {
    }

    @Override
    public void add() {
        this.crossCuttingConcernFacade.authorization.authorize();
        this.crossCuttingConcernFacade.logger.log("Customer Add");
        this.crossCuttingConcernFacade.caching.cache("customer add method");
    }
}
