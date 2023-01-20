package behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        User user = new User("İrem");
        User user1 = new User("Halit");

        user.sendMessage("Merhaba");
        user1.sendMessage("Selamlar");
    }
}
