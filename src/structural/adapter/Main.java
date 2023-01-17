package structural.adapter;


import structural.adapter.adapters.JavaFileLoggerAdapter;
import structural.adapter.logging.DatabaseLogger;
import structural.adapter.logging.ILogger;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        ILogger logger = new DatabaseLogger();

        logger.log("Deneme 123");
    }
}
