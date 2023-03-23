package org.example.oop.hw5.model;

//import org.example.oop.hw4.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class MultiVM implements VendingMachine {
    List<Product> load = new ArrayList<>();

    @Override
    public void insertProduct(List<Product> prod) {
        load.addAll(prod);
    }

    @Override
    public Product getProduct(String name) {
        for (Product p : load) {
            if (p.getName().equals(name)){
                return p;
            }
        }
        return new Product("Такого продукта нет",0);
    }


}
