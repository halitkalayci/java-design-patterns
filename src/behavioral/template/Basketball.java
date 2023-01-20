package behavioral.template;

public class Basketball extends Game{
    @Override
    void initialize() {
        System.out.println("Basketball initialize");
    }

    @Override
    void start() {
        System.out.println("Basketball start");
    }

    @Override
    void end() {
        System.out.println("Basketball end");
    }
}
