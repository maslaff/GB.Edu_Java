package org.example.oop.hw6;

public class TempDetectorBuilder {
    public TempDetectorBuilder instance = null;

    TempDetector obj;

//    TempDetectorBuilder(){}

    public TempDetectorBuilder getInstance(){
        if(instance==null)
            instance = new TempDetectorBuilder();
        instance.obj = new TempDetector();

        return instance;
    }

    public TempDetectorBuilder setAddress(int adr){
        obj.setAddress(adr);
        return this;
    }
}

// 1:50