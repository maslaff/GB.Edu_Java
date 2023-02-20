package org.example.seminar1.hw2;

import java.util.Scanner;

public class Hw2_2 {
    public static void main(String[] args) {
        System.out.println((checkRise() ? "Возрастающая" : "НЕ возрастающая") + " последовательность");
    }
    private static boolean checkRise(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите количество чисел для ввода: ");
        int numCount = scanner.nextInt();
        int num = 0;
        for (int i = 0; i < numCount; i++) {
            int new_num = scanner.nextInt();
            if(new_num > num) num = new_num;
            else return false;
        }
        return true;
    }
}
