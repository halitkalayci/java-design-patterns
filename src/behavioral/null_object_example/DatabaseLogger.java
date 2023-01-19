package behavioral.null_object_example;

public class DatabaseLogger implements ILogger{
    @Override
    public void log(String message) {
        System.out.println("Database'e loglandı: " + message);
    }
}
