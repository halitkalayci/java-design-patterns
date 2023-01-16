package creational.singleton;

import creational.singleton.loggers.ILogger;
import creational.singleton.loggers.Logger;

public class Main {
    public static void main(String[] args) {
        // Singleton pattern uygulanmadığında..
       /* ILogger logger = new Logger("Database");
        ILogger logger2 = new Logger("Console");
        logger.log("No Singleton Deneme");
        logger2.log("No Singleton Deneme 2");


        //Single-Thread
        //Singleton pattern kullanıldığında..
        ILogger logger3 = Logger.getInstance("Database");
        ILogger logger4 = Logger.getInstance("Console");
        logger3.log("Singleton Deneme");
        logger4.log("Singleton Deneme 2");
        */

        // Multi-Thread
        // Simülasyon..
        // 1. api isteği, 2. api isteği..
        Thread thread1 = new Thread(new LoggerThread1());
        Thread thread2 = new Thread(new LoggerThread2());
        System.out.println("Eğer tipler aynı ise, singleton pattern başarıyla uygulanmıştır.. Tipler farklı ise 2 farklı instance oluşmaktadır..");
        thread1.start();
        thread2.start();
    }

    static class LoggerThread1 implements Runnable{
        @Override
        public void run() {
            ILogger logger = Logger.getInstance("Thread 1");
            logger.log("Merhaba");
        }
    }
    static class LoggerThread2 implements Runnable{
        @Override
        public void run() {
            ILogger logger = Logger.getInstance("Thread 2");
            logger.log("Merhaba 2");
        }
    }
}
