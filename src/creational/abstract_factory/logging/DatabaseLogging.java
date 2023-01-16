package creational.abstract_factory.logging;

public class DatabaseLogging extends Logging{
    @Override
    public void log(String message) {
        System.out.println("Database'e loglandı: " + message);
    }
}
