package creational.singleton.loggers;

public class Logger implements ILogger{
    private static volatile Logger instance;
    private String type;

    public Logger(String type) {
        // 1 saniyelik bir işlem...
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
    // Tek bir instance olucak..
    // Eğer instance yoksa bir kereye mahsus newleme işlemi gerçekleşecek..
    // Instance var ise return edilecek..
    public static Logger getInstance(String type){
        // instance boş ise, newle
        // locklama
        // hali hazırda bu fonksiyon bir thread tarafından çalıştırılıyor ise..
        // lock
        Logger logger = instance;
        if(logger!=null) return logger;
        synchronized(Logger.class){
            if(instance==null)
                instance=new Logger(type);
            return instance;
        }
    }
}
