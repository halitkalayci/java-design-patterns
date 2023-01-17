package structural.facade.logging;

public class FileLogger implements ILogger{
    @Override
    public void log(String message) {
        System.out.println("File logged: " + message);
    }
}
