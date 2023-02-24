package org.example.seminar1.hw3.t4;

import java.util.ArrayList;
import java.util.Arrays;

public class t4 {
    public static void main(String[] args) {
        Integer [] initValues = {1,2,3};
        ArrayList<Integer> values = new ArrayList<>(Arrays.asList(initValues));
        ArrayList<ArrayList> variants = new ArrayList<>();
        for (int i = 0; i < values.size(); i++) {
            for (int j = 0; j < values.size()-1; j++) {
                System.out.println(values);
                variants.add((ArrayList) values.clone());
                int tmp = values.get(j);
                values.remove(j);
                values.add(j+1, tmp);
            }
        }
        System.out.println(variants);
    }
}
