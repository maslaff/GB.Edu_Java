package org.example.oop.hw3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListOfCats cats = new ListOfCats();
        cats.setCatList(List.of(new Cat("barsik"), new Cat("murzik")));
//        System.out.println(cats.iterator().next().toString());
//        DogComparator dcomp = new DogComparator();
//        TreeSet<Dog> dogs = new TreeSet<>(dcomp);
        ListOfDogs dogs = new ListOfDogs();
        dogs.setDogList(List.of(
                new Dog("Spherule", 2),
                new Dog("Acey", 3),
                new Dog("Beany", 1),
                new Dog("Acey", 1)
        ));
        while (cats.iterator().hasNext()) {
            System.out.println(cats.iterator().next().getName());
            //Создать класс Dog и добавить возможноность итерирования по нему
        }

        while (dogs.iterator().hasNext()) {
            System.out.println(dogs.iterator().next().getName());
        }

//        for (Dog d:dogs){
//            System.out.println(d);
//        }
    }
}
