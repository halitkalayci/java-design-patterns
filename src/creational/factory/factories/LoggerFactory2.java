package creational.factory.factories;

import creational.factory.logging.FileLogger;
import creational.factory.logging.ILogger;

public class LoggerFactory2 implements ILoggerFactory{
    @Override
    public ILogger createLogger() {
        return new FileLogger();
    }
}
