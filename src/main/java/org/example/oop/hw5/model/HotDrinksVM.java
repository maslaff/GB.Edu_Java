package org.example.oop.hw5.model;

//import org.example.oop.hw4.VendingMachine;
//import org.example.oop.hw5.model.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksVM implements VendingMachine {

    List<HotDrink> hotDrinks = new ArrayList<>();

    @Override
    public void insertProduct(List<Product> prod) {
        for (Product hd: prod) {
            hotDrinks.add((HotDrink) hd);
        }
    }

    @Override
    public Product getProduct(String name) {
        for (Product p : hotDrinks) {
            if (p.getName().equals(name)){
                return p;
            }
        }
        return new Product("Такого продукта нет",0);
    }

    public Product getProduct(String name, int volume, int temperature) {
        for (HotDrink p : hotDrinks) {
//            System.out.println(name + " " + volume + " " + temperature + "\n" + p.getName() + " " + p.getVolume() + " " + p.getTemperature() + "\n-----");
            if (p.getName().equals(name) && p.getVolume() == volume && p.getTemperature() == temperature){
                return p;
            }
        }
        return new Product("Такого продукта нет",0);
    }

}
