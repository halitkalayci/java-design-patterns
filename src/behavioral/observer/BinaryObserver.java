package behavioral.observer;

public class BinaryObserver extends Observer{
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.subscribe(this);
    }

    @Override
    public void update() {
        int subjectValue = subject.getState();
        System.out.println("Değişen yeni değerin Binary değeri: " + Integer.toBinaryString(subjectValue));
    }
}
