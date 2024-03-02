package Seminar.sem1.tsk2;

public interface VendingMachine {
    void addProductList(Product product);

    Product getProductByName(String name);

    Product getProductByCost(Double cost);
}