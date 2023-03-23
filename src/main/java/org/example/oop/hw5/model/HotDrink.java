package org.example.oop.hw5.model;

public class HotDrink extends Product {
    private int volume;
    private int temperature;

    public HotDrink(String name, int cost, int volume, int temperature) {
        super(name, cost);
        this.volume = volume;
        this.temperature = temperature;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return getName() + " " + volume + "ml., " + temperature + "°C =" + getCost() + '₽';
    }
}
