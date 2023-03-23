package org.example.oop.hw5;

import org.example.oop.hw4.HotDrink;
import org.example.oop.hw4.HotDrinksVM;
import org.example.oop.hw4.MultiVM;
import org.example.oop.hw4.Snacks;
import org.example.oop.hw5.controller.VMController;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        VMController vmc = new VMController();
        vmc.LoadMachine();
    }
}
