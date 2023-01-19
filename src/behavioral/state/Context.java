package behavioral.state;

public class Context {
    private State state;

    public Context(){
        this.state=null;
    }
    public Context(State state) {
        this.state = state;
    }

    public void setState(State state){
        this.state = state;
    }
    public State getState(){
        return state;
    }
}
