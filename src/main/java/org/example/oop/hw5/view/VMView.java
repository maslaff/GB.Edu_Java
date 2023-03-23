package org.example.oop.hw5.view;

import org.example.oop.hw5.model.Product;

public class VMView {

        public void printHotDrinkInfo(String name, int cost, int volume, int temperature) {
                System.out.println(hotDrinkVM1.getProduct("Tea", 200, 92).toString());
                System.out.println(hotDrinkVM2.getProduct("Soup", 200, 85).toString());
                System.out.println(multiVM.getProduct("Coffee"));
                System.out.println(multiVM.getProduct("3 crusts"));
        }
}
