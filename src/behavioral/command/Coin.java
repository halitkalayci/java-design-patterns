package behavioral.command;

public class Coin {

    public String name;

    public void buy(){
        System.out.println("Buyed " + name);
    }
    public void sell(){
        System.out.println("Selled " + name);
    }
}
