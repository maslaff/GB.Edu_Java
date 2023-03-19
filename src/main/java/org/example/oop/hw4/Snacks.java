package org.example.oop.hw4;

public class Snacks extends Product implements Comparable<Snacks> {
    int weight;
    public Snacks(String name, int cost, int weight) {
        super(name, cost);
        this.weight = weight;
    }

    @Override
    public int compareTo(Snacks o) {
        return Integer.compare(weight, o.weight);
    }

    @Override
    public String toString() {
        return "Snack " +
                getName() +
                " " +
                weight +
                "gr. =" +
                getCost() +
                "₽";
    }
}
