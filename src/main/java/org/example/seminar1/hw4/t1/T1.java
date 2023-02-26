package org.example.seminar1.hw4.t1;

import java.util.LinkedList;
import java.util.List;

public class T1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(List.of(1,2,3,4,5,6,7));
        int size = list.size();
        for (int i = 0; i < size; i++)
            list.add(i, list.pollLast());
        System.out.println(list);
    }
}
