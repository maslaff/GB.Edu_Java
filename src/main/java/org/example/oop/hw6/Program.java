package org.example.oop.hw6;

public class Program {
    public static void main(String[] args) {
        FireAlarm fa = new FireAlarm("S3000N");
        fa.addDetector(DetectorBuilder.getInstanceSD().getInstance().setAddress(1).obj);
        fa.addDetector(DetectorBuilder.getInstanceTD().getInstance().setAddress(5).obj);
        fa.addDetector(DetectorBuilder.getInstanceTD().getInstance().setAddress(2).obj);
        fa.addDetector(DetectorBuilder.getInstanceSD().getInstance().setAddress(7).obj);
        fa.addDetector(DetectorBuilder.getInstanceSD().getInstance().setAddress(4).obj);
        fa.addDetector(DetectorBuilder.getInstanceTD().getInstance().setAddress(8).obj);
        fa.addDetector(DetectorBuilder.getInstanceSD().getInstance().setAddress(3).obj);
        fa.addDetector(DetectorBuilder.getInstanceSD().getInstance().setAddress(6).obj);

        fa.getDetectorsList().forEach(System.out::println);
    }
}
