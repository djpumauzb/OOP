package Seminar.sem2.hw;

public interface QueueBehavior {
    void takeInQueue();

    void takeOrders();

    void giveOrders();

    void releaseFromQueue();

//    void cancelOrder(Actor actor);
}