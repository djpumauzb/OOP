package Seminar.sem1.tsk1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    List<Product> productList = new ArrayList<>();

    public VendingMachine(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> geProductList() {
        return productList;
    }

    public void addProductList(Product product) {
        productList.add(product);
    }

    Product getProductByName(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    Product getProductByCost(Double cost) {
        for (Product product : productList) {
            if (product.getCost() == cost) {
                return product;
            }
        }
        return null;
    }
}