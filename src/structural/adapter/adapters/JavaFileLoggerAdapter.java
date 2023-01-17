package structural.adapter.adapters;

import structural.adapter.logging.ILogger;
import structural.adapter.logging.JavaFileLogger;

public class JavaFileLoggerAdapter implements ILogger {
    @Override
    public void log(String message) {
        // Ek paketi çağırma işlemi...
        JavaFileLogger javaFileLogger = new JavaFileLogger();
        javaFileLogger.logData(message);
    }
}
