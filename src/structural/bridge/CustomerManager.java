package structural.bridge;

public class CustomerManager implements ICustomerService{

    public MessageSenderBase messageSenderBase;
    @Override
    public void verify() {
        messageSenderBase.send();
    }
}
