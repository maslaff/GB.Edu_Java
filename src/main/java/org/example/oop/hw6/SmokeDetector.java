package org.example.oop.hw6;

import java.util.Random;

public class SmokeDetector extends Detector {
    int gasLevel;
    int treshold;

    public SmokeDetector() {
        this.treshold = 20;
        this.determineGasLevel();
    }

    public void determineGasLevel(){
        this.gasLevel = new Random().nextInt(0, 35);
        this.setAlarm(this.gasLevel > this.treshold);
    }

    public int getGasLevel() {
        return this.gasLevel;
    }

    @Override
    public String toString() {
        return "SmokeDetector{" +
                "uid=" + uid +
                ", address=" + address +
                ", gasLevel=" + gasLevel +
                ", treshold=" + treshold +
                ", alarm=" + alarm +
                ", connectionQuality=" + connectionQuality +
                '}';
    }
}
