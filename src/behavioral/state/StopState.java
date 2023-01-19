package behavioral.state;

public class StopState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Player durduluyor...");
        context.setState(this);
    }
}
