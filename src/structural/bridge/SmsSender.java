package structural.bridge;

public class SmsSender extends MessageSenderBase{
    @Override
    public void send() {
        // SMS yollama kodları..
        System.out.println("SMS ile yollandı.");
    }
}
