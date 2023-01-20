package behavioral.template;

public class Football extends Game{
    @Override
    void initialize() {
        System.out.println("Football initialize");
    }

    @Override
    void start() {
        System.out.println("Football start");
    }

    @Override
    void end() {
        System.out.println("Football end");
    }
}
