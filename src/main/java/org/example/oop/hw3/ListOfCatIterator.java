package org.example.oop.hw3;

import java.util.Iterator;
import java.util.List;

public class ListOfCatIterator implements Iterator<Cat> {
    private final List<Cat> catListIterator;
    public static int counter;
    public ListOfCatIterator(List<Cat> catList){
        catListIterator = catList;
//        counter = 0;

    }
    @Override
    public boolean hasNext() {
        return counter < catListIterator.size() - 1;
    }

    @Override
    public Cat next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        System.out.println(counter);
        return catListIterator.get(counter);
    }
}
