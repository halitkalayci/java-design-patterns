package structural.bridge;

public class EmailSender extends MessageSenderBase{
    @Override
    public void send() {
        // Email kodları smtp.. vs
        System.out.println("Email ile yollandı..");
    }
}
