package org.example.seminar1.vers;

import java.util.Arrays;
import java.util.Random;

public class Hw2_3 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Укажите количество чисел для ввода: ");
//        int numCount = scanner.nextInt();
        int [] numsArray = {12,14,-3,57,-14,2,8,-12};
        int acc = 0;
        for (int i = 0; i < numsArray.length; i++) {
            int num = numsArray[i] >= 0 ? numsArray[i] : numsArray[i] * -1;
            if(num > 9 && num < 100) acc += i;
        }
        System.out.println(Arrays.toString(numsArray));
        System.out.println(acc);
    }
    private static int[] getNumsArray(int numCount, int min, int max){
        Random rn = new Random();
        int[] numsArray = new int[numCount];
        for (int i = 0; i < numCount; i++) {
            numsArray[i] = rn.nextInt(max - min) + min;
        }
        return numsArray;
    }
}
