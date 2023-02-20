package org.example.seminar1.hw2;

import java.util.Arrays;

public class Hw2_3 {
    public static void main(String[] args) {
//        int[] nArr = {12, 14, -3, 57, -14, 2, 8, -12};
        int[] nArr = {12, 14, -3, 0, 57, -14, 2, 8, -12};
        int acc = 0;
        for (int i = 0; i < nArr.length; i++) {
            if (nArr[i] > 9 && nArr[i] < 100
                    || nArr[i] > -100 && nArr[i] < -9)
                acc += i;
        }
        System.out.println(Arrays.toString(nArr));
        System.out.println(acc);
        for (int i = 0; i < nArr.length; i++) {
            if (nArr[i] < 0) nArr[i] = acc;
        }
        System.out.println(Arrays.toString(nArr));
    }
}
