package org.example.oop.hw5.controller;

//import org.example.oop.hw4.HotDrink;
//import org.example.oop.hw4.HotDrinksVM;
//import org.example.oop.hw4.MultiVM;
//import org.example.oop.hw4.Snacks;
//import org.example.oop.hw5.model.*;
//import org.example.oop.hw5.view.*;


import org.example.oop.hw5.model.HotDrink;
import org.example.oop.hw5.model.HotDrinksVM;
import org.example.oop.hw5.model.MultiVM;
import org.example.oop.hw5.model.Snacks;

import java.util.List;

public class VMController {
    private HotDrinksVM hotDrinkVM1 = new HotDrinksVM();
    private HotDrinksVM hotDrinkVM2 = new HotDrinksVM();
    private MultiVM multiVM = new MultiVM();
    public void LoadMachine() {

        //        VendingMachine vendingMachine = new VendingMachine();
        HotDrink tea = new HotDrink("Tea", 50, 200, 92);
        HotDrink teaBig = new HotDrink("Tea", 70, 300, 92);
        HotDrink coffee = new HotDrink("Coffee", 80, 150, 95);
        HotDrink chocolate = new HotDrink("Hot Chocolate", 100, 200, 90);
        HotDrink soup = new HotDrink("Soup", 80, 200, 85);
        Snacks crackers = new Snacks("3 crusts", 50, 45);


        hotDrinkVM1.insertProduct(List.of(tea, teaBig, coffee, chocolate));
        hotDrinkVM2.insertProduct(List.of(tea, teaBig, coffee, soup));
        multiVM.insertProduct(List.of(coffee, teaBig, crackers));


    }

}
