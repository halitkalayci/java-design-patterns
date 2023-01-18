package behavioral.chain_of_responsibility.logging;

public class ConsoleLogger extends AbstractLogger{
    @Override
    void log(String message) {
        System.out.println("Console'a loglandı: " + message);
    }
}
