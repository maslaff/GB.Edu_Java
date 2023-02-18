package org.example.seminar1.cw2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num1 = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int num2 = scanner.nextInt();
            if (num1 > 0 && num2 < 0) {
                count++;
            }
            num1 = num2;
        }
        scanner.close();
        System.out.println(count);
    }
}
