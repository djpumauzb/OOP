package Seminar.sem1.tsk2;

public abstract class Product {
    private String name;
    private Double cost;

    public Product(String name, Double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return String.format("Product: %d , Cost: %d", name, cost);
    }
}
