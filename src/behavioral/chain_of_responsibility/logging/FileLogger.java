package behavioral.chain_of_responsibility.logging;

public class FileLogger extends AbstractLogger{
    @Override
    void log(String message) {
        System.out.println("Dosyaya loglandı: " + message);
    }
}
