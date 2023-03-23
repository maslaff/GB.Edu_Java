package org.example.oop.hw5.model;

import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {
    List<Product> products = new ArrayList<>();

    void insertProduct(List<Product> prod);
    Product getProduct(String name);
}
