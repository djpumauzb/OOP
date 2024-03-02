package Seminar.sem1.tsk2;

public class Main {
    public static void main(String[] args) {
        BottleOfWaterVM machine = new BottleOfWaterVM();
        machine.addProductList(new BottleOfWater("Montella", 100, 5));
        machine.addProductList(new BottleOfWater("Chortoq", 10, 0.7));
        machine.addProductList(new BottleOfWater("Hydrolife", 1000, 1));
        machine.addProductList(new BottleOfWater("Asu", 3, 0.5));

        printProductByName(machine, "Asu");
    }

    public static void printProductByName(VendingMachine vendingMachine,
            String name) {
        System.out.println(vendingMachine.getProductByName(name));
    }
}
