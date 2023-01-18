package behavioral.chain_of_responsibility.patterns;

import behavioral.chain_of_responsibility.logging.AbstractLogger;
import behavioral.chain_of_responsibility.logging.ConsoleLogger;
import behavioral.chain_of_responsibility.logging.DatabaseLogger;
import behavioral.chain_of_responsibility.logging.FileLogger;

public class LoggerChainPatterns {
    public static AbstractLogger getChainOfLoggers(){
        AbstractLogger databaseLogger = new DatabaseLogger();
        AbstractLogger fileLogger = new FileLogger();
        AbstractLogger consoleLogger = new ConsoleLogger();

        databaseLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return databaseLogger;
    }
}
