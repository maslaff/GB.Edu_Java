package org.example.seminar1.hw6;

public class Notebook {
    String model;
    Integer ram;
    Integer storage;
    String os;
    String color;

    public Notebook(String model, Integer ram, Integer storage, String os, String color) {
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
    }

    public Integer getRam() {
        return ram;
    }

    public Integer getStorage() {
        return storage;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "model='" + model + '\'' +
                ", ram=" + ram + "gb" +
                ", storage=" + storage + "gb" +
                ", os '" + os + '\'' +
                ", color '" + color + '\'';
    }
}
