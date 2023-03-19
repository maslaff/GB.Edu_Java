package org.example.oop.hw4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotDrinksVM hotDrinkVM1 = new HotDrinksVM();
        HotDrinksVM hotDrinkVM2 = new HotDrinksVM();
        MultiVM multiVM = new MultiVM();
//        VendingMachine vendingMachine = new VendingMachine();
        HotDrink tea = new HotDrink("Tea", 50, 200, 92);
        HotDrink teaBig = new HotDrink("Tea", 70, 300, 92);
        HotDrink coffee = new HotDrink("Coffee", 80, 150, 95);
        HotDrink chocolate = new HotDrink("Hot Chocolate", 100, 200, 90);
        HotDrink soup = new HotDrink("Soup", 80, 200, 85);
        Snacks crackers = new Snacks("3 crusts", 50, 45);

        hotDrinkVM1.insertProduct(List.of(tea, teaBig, coffee,chocolate));
        hotDrinkVM2.insertProduct(List.of(tea, teaBig, coffee, soup));
        multiVM.insertProduct(List.of(coffee, teaBig, crackers));

        System.out.println(hotDrinkVM1.getProduct("Tea", 200, 92).toString());
        System.out.println(hotDrinkVM2.getProduct("Soup", 200, 85).toString());
        System.out.println(multiVM.getProduct("Coffee"));
        System.out.println(multiVM.getProduct("3 crusts"));
    }
}
