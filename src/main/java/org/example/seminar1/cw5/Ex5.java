package org.example.seminar1.cw5;

public class Ex5 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 6, 3, 2, 1};
        System.out.println(tester(myArray));
    }

    public static String tester(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - i - 1]) {
                return "Не симметричный";
            }
        }
        return "Симметричный";
    }

}
