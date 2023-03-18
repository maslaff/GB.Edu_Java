package org.example.oop.hw3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class ListOfDogs implements Iterable<Dog>{
    private DogComparator dcomp = new DogComparator();
    private TreeSet<Dog> dogList = new TreeSet<>(dcomp);

    public TreeSet<Dog> getDogList() {
        return dogList;
    }

    public void setDogList(List <Dog> dogList) {
        this.dogList.addAll(dogList);
//        dogList.forEach((Dog d) -> this.dogList.add(d));
    }

    @Override
    public Iterator<Dog> iterator() {
        return new ListOfDogIterator(new ArrayList<>(dogList));
    }
}
