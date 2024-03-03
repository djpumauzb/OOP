package Seminar.sem2.tsk2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human ivan = new Human("Ivan");
        Human petr = new Human("Petr");
        market.acceptToMarket(ivan);
        market.acceptToMarket(petr);
        market.update();
    }
}
