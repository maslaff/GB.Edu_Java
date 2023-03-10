package org.example.seminar1.hw2;

import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        System.out.println(getNum());
    }
    private static int getNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите количество чисел для ввода: ");
        int numCount = scanner.nextInt();
        int acc = 0;
        for (int i = 0; i < numCount; i++) {
            int new_num = scanner.nextInt();
            if(new_num > 1 && checkPrime(new_num)) acc += new_num;
        }
        return acc;
    }
    private static boolean checkPrime(int num){
        if (num > 3) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) return false;
            }
        }
        return true;
    }
}
