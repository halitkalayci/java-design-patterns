package creational.abstract_factory.logging;

public class FileLogging extends Logging{
    @Override
    public void log(String message) {
        System.out.println("File loglandı: " + message);
    }
}
