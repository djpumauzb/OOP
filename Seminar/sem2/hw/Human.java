package Seminar.sem2.hw;

public class Human extends Actor {
    public Human(String name) {
        super(name);
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.makeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
        super.takeOrder = takeOrder;
    }

    @Override
    public void setInQueue(boolean inQueue) {

    }

    @Override
    public boolean isMakeOrder() {
        return makeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return takeOrder;
    }

    @Override
    public boolean isInQueue() {
        return inQueue;
    }
}