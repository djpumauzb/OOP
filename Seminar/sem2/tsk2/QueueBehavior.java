package Seminar.sem2.tsk2;

public interface QueueBehavior {

    void takeInQueue(Actor actor);

    void takeOrders();

    void giveOrders();

    void relaseFromQueue();

}
