package Seminar.sem2.hw;

public abstract class Actor implements ActorBehavior {
    protected String name;
    protected boolean makeOrder;
    protected boolean takeOrder;
    protected boolean inQueue;

    public Actor(String name) {
        this.name = name;
        inQueue = false;
        makeOrder = false;
        takeOrder = false;
    }

    public String getName() {
        return name;
    }
}
