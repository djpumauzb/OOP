package Seminar.sem1.hw;

import java.util.ArrayList;
import java.util.List;

public class BottleOfWaterVM implements VendingMachine {
    private List<Product> productList = new ArrayList<>();

    @Override
    public void addProductList(Product product) {
        ((BottleOfWater)product).getCost();
        productList.add(product);
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public Product getProduct(Double cost) {
        for (Product product : productList) {
            if (product.getCost() == cost) {
                return product;
            }
        }
        return null;
    }

    public Product getProduct(String name, double volume, double temperature) {

    }
}
