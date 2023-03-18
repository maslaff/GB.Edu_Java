package org.example.oop.hw3;

import java.util.Iterator;
import java.util.List;

public class ListOfDogIterator implements Iterator<Dog>{
        private List<Dog> dogListIterator;
        private static int counter;
        public ListOfDogIterator(List<Dog> dogList){
            dogListIterator = dogList;
        }
        @Override
        public boolean hasNext() {
            return counter < dogListIterator.size() - 1;
        }

        @Override
        public Dog next() {
            if (!hasNext()){
                return null;
            }
            counter++;
            return dogListIterator.get(counter);
        }
    }


