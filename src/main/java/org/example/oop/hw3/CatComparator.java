package org.example.oop.hw3;

import java.util.Comparator;

public class CatComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        return Integer.compare(o1.getName().length(), o2.getName().length());
    }
}
