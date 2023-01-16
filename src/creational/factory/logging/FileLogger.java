package creational.factory.logging;

public class FileLogger implements ILogger{
    @Override
    public void log(String message) {
        System.out.println("File Logged: " + message);
    }
}
