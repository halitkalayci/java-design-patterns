package creational.factory;

import creational.factory.logging.DatabaseLogger;
import creational.factory.logging.FileLogger;
import creational.factory.logging.ILogger;

public class LoggerFactory {
    // Fabrika görevi..

    public ILogger createLogger(){
        // Hangi loggerin döneceğine karar veren iş kodu.. Business code..
        // Dönecek logger türünün konfigürasyonu..
        return new DatabaseLogger();
    }
}
