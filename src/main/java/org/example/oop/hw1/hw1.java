package org.example.oop.hw1;

import java.util.List;

public class hw1 {
    public static void main(String[] args) {
        HotDrinksVM hotDrinkVM1 = new HotDrinksVM();
        HotDrinksVM hotDrinkVM2 = new HotDrinksVM();
//        VendingMachine vendingMachine = new VendingMachine();
        HotDrink tea = new HotDrink("Tea", 50, 200, 92);
        HotDrink teaBig = new HotDrink("Tea", 70, 300, 92);
        HotDrink coffee = new HotDrink("Coffee", 80, 150, 95);
        HotDrink chocolate = new HotDrink("Hot Chocolate", 100, 200, 90);
        HotDrink soup = new HotDrink("Soup", 80, 200, 85);

        hotDrinkVM1.insertProduct(List.of(tea, teaBig, coffee,chocolate));
        hotDrinkVM2.insertProduct(List.of(tea, teaBig, coffee, soup));

        System.out.println(hotDrinkVM1.getProduct("Tea", 200, 92).toString());
        System.out.println(hotDrinkVM2.getProduct("Soup", 200, 85).toString());
    }
}
