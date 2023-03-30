package org.example.oop.hw6;

import java.util.Random;

public class TempDetector extends Detector{
    double temperature;
    double treshold;

    public TempDetector() {
        this.treshold = 80;
        this.determineTemperature();
    }

    public void determineTemperature(){
        double t = new Random().nextDouble(0, 100);
        this.temperature = Math.round(t*100.0)/100.0;
                this.setAlarm(this.temperature > this.treshold);
    }

    public double getTemperature() {
        return this.temperature;
    }

    @Override
    public String toString() {
        return "TempDetector{" +
                "uid=" + uid +
                ", address=" + address +
                ", temperature=" + temperature +
                ", treshold=" + treshold +
                ", alarm=" + alarm +
                ", connectionQuality=" + connectionQuality +
                '}';
    }
}
