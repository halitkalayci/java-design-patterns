package creational.factory.factories;

import creational.factory.logging.DatabaseLogger;
import creational.factory.logging.ILogger;

public class LoggerFactory implements ILoggerFactory
{
    // Fabrika görevi..

    @Override
    public ILogger createLogger(){
        // Hangi loggerin döneceğine karar veren iş kodu.. Business code..
        // Dönecek logger türünün konfigürasyonu..
        return new DatabaseLogger();
    }
}
