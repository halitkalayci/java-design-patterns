package structural.adapter.logging;

public class DatabaseLogger implements ILogger{
    @Override
    public void log(String message) {
        // Belirli kodlar.. db'ye bağlan logu ilgili tabloya at..
        System.out.println("Database loglandı: " + message);
    }
}
