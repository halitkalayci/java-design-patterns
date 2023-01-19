package behavioral.state;

public class StartState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Player başlatılıyor..");
        context.setState(this);
    }
}
