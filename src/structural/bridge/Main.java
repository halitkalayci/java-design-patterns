package structural.bridge;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerService = new CustomerManager();
        customerService.messageSenderBase = new EmailSender();
        customerService.verify();

        customerService.messageSenderBase = new SmsSender();
        customerService.verify();
    }
}
