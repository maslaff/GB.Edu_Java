package org.example.oop.hw6;

public class SmokeDetectorBuilder {
    public SmokeDetectorBuilder instance = null;

    SmokeDetector obj;

//    SmokeDetectorBuilder(){}

    public SmokeDetectorBuilder getInstance(){
        if(instance==null)
            instance = new SmokeDetectorBuilder();
        instance.obj = new SmokeDetector();

        return instance;
    }

    public SmokeDetectorBuilder setAddress(int adr){
        obj.setAddress(adr);
        return this;
    }
}
