package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        BinaryObserver binaryObserver = new BinaryObserver(subject);
        HexaObserver hexaObserver = new HexaObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);

        subject.setState(10);
        System.out.println("****************");
        subject.setState(20);
    }
}
