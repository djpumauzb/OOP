package Seminar.sem1.tsk2;

import java.util.ArrayList;
import java.util.List;

public class BottleOfWaterVM implements VendingMachine {
    private List<Product> productList = new ArrayList<>();

    @Override
    public void addProductList(Product product) {
        productList.add(product);
    }

    @Override
    public Product getProductByName(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public Product getProductByCost(Double cost) {
        for (Product product : productList) {
            if (product.getCost() == cost) {
                return product;
            }
        }
        return null;
    }

    public void addProductList(String string, int i, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addProductList'");
    }

}
