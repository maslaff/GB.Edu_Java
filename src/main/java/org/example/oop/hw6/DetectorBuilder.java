package org.example.oop.hw6;

public class DetectorBuilder {
    public static SmokeDetectorBuilder getInstanceSD(){
        SmokeDetectorBuilder sdBuilder = new SmokeDetectorBuilder();
        if(sdBuilder.instance == null)
            sdBuilder.instance = new SmokeDetectorBuilder();
        sdBuilder.instance.obj = new SmokeDetector();

        return sdBuilder;
    }
    public static TempDetectorBuilder getInstanceTD(){
        TempDetectorBuilder tdBuilder = new TempDetectorBuilder();
        if(tdBuilder.instance == null)
            tdBuilder.instance = new TempDetectorBuilder();
        tdBuilder.instance.obj = new TempDetector();

        return tdBuilder;
    }

}
