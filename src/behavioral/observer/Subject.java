package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    // getState, setState,
    // notifySubscribers, subscribe (attach,addNewSubscriber)

    // Subscriberlar
    private List<Observer> observers = new ArrayList<Observer>();
    // State'im ne olacak ise..
    private int state;


    public int getState(){
        return state;
    }

    public void setState(int stateToSet){
        state = stateToSet;
        notifySubscribers();
    }

    public void notifySubscribers(){
        for(Observer observer : observers){
            observer.update();
        }
    }

    public void subscribe(Observer observer){
        observers.add(observer);
    }
    public void unsubscribe(Observer observer){
        observers.remove(observer);
    }

}
