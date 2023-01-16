package creational.singleton.loggers;

public class Logger implements ILogger{
    private static Logger instance;
    private String type;

    public Logger(String type) {
        this.type = type;
    }

    @Override
    public void log(String message) {
        System.out.println("Logged: " + message + " Type: " + type);
    }
    // Tek bir instance olucak..
    // Eğer instance yoksa bir kereye mahsus newleme işlemi gerçekleşecek..
    // Instance var ise return edilecek..
    public static Logger getInstance(String type){
        // instance boş ise, newle
        if(instance==null)
        {
            instance = new Logger(type);
        }
        return instance;
    }
}
