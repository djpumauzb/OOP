package Seminar.sem2.tsk2;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehavior {

    private List<Actor> actorList = new ArrayList<>();

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " on the Queue");
        actorList.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor : actorList) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " made his/her order");
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor : actorList) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " got his/her order");
            }
        }
    }

    @Override
    public void relaseFromQueue() {
        List<Actor> relasedActors = new ArrayList<>();
        for (Actor actor : actorList) {
            if (actor.isTakeOrder()) {
                relasedActors.add(actor);
                System.out.println(actor.getName() + " left from queue");
            }
        }
        relaseFromMarket(relasedActors);
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " came to the Market");
        takeInQueue(actor);
    }

    @Override
    public void relaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " left the Market");
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        relaseFromQueue();
    }

}
