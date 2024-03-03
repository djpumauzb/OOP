package Seminar.sem2.hw;

import java.util.List;

public interface MarketBehavior {
    void acceptToMarket(Actor actor);

    void actorsInMarket();

    void releaseFromMarket(List<Actor> actors);

    void update();
}
