package behavioral.observer;

public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject=subject;
        this.subject.subscribe(this);
    }
    @Override
    public void update() {
        int subjectValue = this.subject.getState();
        System.out.println("Değişen yeni değerin Octal türündeki değeri: " + Integer.toOctalString(subjectValue));
    }
}
