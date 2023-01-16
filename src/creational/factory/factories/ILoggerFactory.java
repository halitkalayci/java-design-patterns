package creational.factory.factories;

import creational.factory.logging.ILogger;

public interface ILoggerFactory {
    ILogger createLogger();
}
