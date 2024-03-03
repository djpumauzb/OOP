package Seminar.sem2.hw;

public interface ActorBehavior {
    void setMakeOrder(boolean makeOrder);

    void setTakeOrder(boolean takeOrder);

    void setInQueue(boolean inQueue);

    boolean isMakeOrder();

    boolean isTakeOrder();

    boolean isInQueue();
}
