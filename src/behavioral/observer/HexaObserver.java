package behavioral.observer;

public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.subscribe(this);
    }

    @Override
    public void update() {
        int subjectValue = subject.getState();
        System.out.println("Değişen yeni değerin Hex değeri: " + Integer.toHexString(subjectValue));
    }
}
