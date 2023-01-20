package behavioral.observer;

public abstract class Observer {
    // update => değişen duruma göre, observerin kendi içindeki
    // yönetimini gerçekleştirecek.

    public abstract void update();
    protected Subject subject;
}
