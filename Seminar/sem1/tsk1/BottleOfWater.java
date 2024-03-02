package Seminar.sem1.tsk1;

public class BottleOfWater extends Product {

    private Double volume;

    public BottleOfWater(String name, Double cost, Double volume) {
        super(name, cost);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }
}
