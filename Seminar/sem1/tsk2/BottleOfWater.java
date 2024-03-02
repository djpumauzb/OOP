package Seminar.sem1.tsk2;

public class BottleOfWater extends Product {

    private double volume;

    public BottleOfWater(String name, double cost, double volume) {
        super(name, cost);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BottleOfWater:" + 
        "name: '" + super.getName() + "'" +
        " | cost: " + super.getCost() +
        " | volume: " + volume;
    }
}
