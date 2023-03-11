package org.example.oop.hw1;
import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {
    List<Product> products = new ArrayList<>();

    void insertProduct(List<Product> prod);
    Product getProduct(String name);
}
