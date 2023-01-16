package creational.singleton;

import creational.singleton.loggers.ILogger;
import creational.singleton.loggers.Logger;

public class Main {
    public static void main(String[] args) {
        // Singleton pattern uygulanmadığında..
        ILogger logger = new Logger("Database");
        ILogger logger2 = new Logger("Console");
        logger.log("No Singleton Deneme");
        logger2.log("No Singleton Deneme 2");
        //

        // Singleton pattern kullanıldığında..
        ILogger logger3 = Logger.getInstance("Database");
        ILogger logger4 = Logger.getInstance("Console");
        logger3.log("Singleton Deneme");
        logger4.log("Singleton Deneme 2");
        //
        // 11.10'da dersteyiz..
    }
}
