package behavioral.chain_of_responsibility.logging;

public abstract class AbstractLogger {
    public AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger _nextLogger){
        nextLogger = _nextLogger;
    }

    public void logMessage(String message){
        // Dışarıdan çağırılacak fonksiyon bu olacak..
        log(message);
        // Is last part of the chain?
        if(nextLogger != null)
        {
            //Recursive call
            nextLogger.logMessage(message);
        }
    }

    abstract void log(String message);
}
