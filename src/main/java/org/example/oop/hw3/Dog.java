package org.example.oop.hw3;

public class Dog {
    String name;
    final String[] sizes;
    int size;

    public Dog(String name, int size) {
        this.name = name;
        this.sizes = new String[]{
                "decorative",
                "little",
                "middle",
                "big",
        };
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
