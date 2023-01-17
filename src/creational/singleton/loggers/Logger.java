package creational.singleton.loggers;

public class Logger implements ILogger{
    private static volatile Logger instance;
    public static Logger getInstance(String type){
        Logger logger = instance;
        if(logger!=null) return logger;
        synchronized(Logger.class){
            if(instance==null)
                instance=new Logger(type);
            return instance;
        }
    }
    private String type;

    public Logger(String type) {
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }
        this.type = type;
    }

    @Override
    public void log(String message) {
        System.out.println("Logged: " + message + " Type: " + type);
    }

}
