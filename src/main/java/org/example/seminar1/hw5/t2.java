package org.example.seminar1.hw5;

import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        t1.printHashMap(t1.countWords(new Scanner(System.in).nextLine()));
    }
}
