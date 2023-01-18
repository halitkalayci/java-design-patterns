package behavioral.chain_of_responsibility;

import behavioral.chain_of_responsibility.logging.AbstractLogger;
import behavioral.chain_of_responsibility.patterns.LoggerChainPatterns;

public class Main {
    public static void main(String[] args) {
        AbstractLogger loggerChain = LoggerChainPatterns.getChainOfLoggers();
        loggerChain.logMessage("Merhaba");
    }
}
