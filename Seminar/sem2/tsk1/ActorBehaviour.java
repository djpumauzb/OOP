package Seminar.sem2.tsk1;

/**
 * ActorBehaviour
 */
public interface ActorBehaviour {

    void setMakeOrder(boolean makeOrder);

    void setTakeOrder(boolean pickUpOrder);

    boolean isMakeOrder();

    boolean isTakeOrder();
}