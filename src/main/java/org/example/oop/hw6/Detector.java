package org.example.oop.hw6;

import java.util.Random;

public abstract class Detector {
    int uid;
    int address;
    int connectionQuality;
    boolean alarm;

    public Detector() {
        readUID();
        determineConnectionQuality();
    }

    private void readUID(){
        this.uid = new Random().nextInt(10000,99999);
    }

    public boolean isAlarm() {
        return this.alarm;
    }

    void setAlarm(boolean alarm) {
        this.alarm = alarm;
    }

    public void determineConnectionQuality(){
        this.connectionQuality = new Random().nextInt(1,100);
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public int getConnectionQuality() {
        return connectionQuality;
    }
}
