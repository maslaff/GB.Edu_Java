package org.example.seminar1.hw1;
import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] splitInput = scanner.nextLine().split(" ");
        String[] rev = new String[splitInput.length];
        for (int i=0; i < splitInput.length; i++){
            rev[i] = splitInput[splitInput.length - i -1].strip();
        }
        System.out.println(String.join(" ", rev));
    }
}
