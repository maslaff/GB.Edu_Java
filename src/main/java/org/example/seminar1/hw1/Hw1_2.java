package org.example.seminar1.hw1;
import java.util.Scanner;

public class Hw1_2 {
    public static void main(String[] args) {
        System.out.println(getNum());
    }
    private static int getNum(){
        Scanner scanner = new Scanner(System.in);
        int acc = 0;
        int num = 0;
        while (true) {
            int new_num = scanner.nextInt();
            if(new_num > 0) num = new_num;
            else if(new_num < 0) acc += num;
            else {
                scanner.close();
                return acc;
            }
        }
    }
}
