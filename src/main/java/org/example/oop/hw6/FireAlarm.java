package org.example.oop.hw6;

import java.util.ArrayList;

public class FireAlarm {
    String controlPanel;
    ArrayList<Detector> detectorsList;

    public FireAlarm(String controlPanel) {
        this.controlPanel = controlPanel;
        detectorsList = new ArrayList<>();
    }

    public void addDetector(Detector det){
        this.detectorsList.add(det);
    }

    public ArrayList<Detector> getDetectorsList() {
        return detectorsList;
    }

    public String getControlPanel() {
        return controlPanel;
    }
}
