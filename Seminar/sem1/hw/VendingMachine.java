package Seminar.sem1.hw;

public interface VendingMachine {
    void addProductList(Product product);

    Product getProduct(String name);

    Product getProduct(Double cost);
}