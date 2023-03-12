package org.example.oop.hw2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PCShop {
    private ArrayList<Notebook> list = new ArrayList<>();
    private ArrayList<Notebook> resList = new ArrayList<>();
    private ArrayList<String> queryTypes = new ArrayList<>(Arrays.asList("RAM", "Storage", "OS", "Color"));
    private Integer ramMin=Integer.MAX_VALUE, ramMax=0;
    private Integer storageMin=Integer.MAX_VALUE, storageMax=0;

    private ArrayList<String> osList;
    private ArrayList<String> colors;
//    HashSet<String> colors = new HashSet<>();

    public PCShop(List<Notebook> list) {
        insList(list);
        resetResult();
    }

    public ArrayList<String> getQueryTypes() {
        return queryTypes;
    }

    public List<Notebook> getList() {
        return list;
    }



    public void insList(List<Notebook> list) {
        this.list.addAll(list);
        fillParams();
    }

    private void fillParams(){
        setRamMinMax();
        setStorageMinMax();
        setOsList();
        setColorList();
    }

    public void printQueryTypes(){
        for (int i = 0; i < queryTypes.size(); i++) {
            System.out.println((i+1) + ". " + queryTypes.get(i));
        }
    }

    private void setRamMinMax(){
        for (Notebook nb : list) {
            int val = nb.getRam();
            if (val > ramMax) ramMax = val;
            else if (val < ramMin) ramMin = val;
        }
    }

    private void setStorageMinMax(){
        for (Notebook nb : list) {
            int val = nb.getStorage();
            if (val > storageMax) storageMax = val;
            else if (val < storageMin) storageMin = val;
        }
    }

    private void setOsList(){
        HashSet<String> nbSet = new HashSet<>();
        list.forEach((Notebook nb) -> nbSet.add(nb.getOs()));
        osList = new ArrayList<>(nbSet);
    }

    private void setColorList(){
        HashSet<String> nbSet = new HashSet<>();
        list.forEach((Notebook nb) -> nbSet.add(nb.getColor()));
        colors = new ArrayList<>(nbSet);

    }

    public Integer getRamMin() { return ramMin; }
    public Integer getRamMax() {
        return ramMax;
    }

    public Integer getStorageMin() {
        return storageMin;
    }

    public Integer getStorageMax() {
        return storageMax;
    }

    public ArrayList<String> getOsList() {
        return osList;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void findByRAM(Integer val) {
        resList.removeIf(nb -> nb.getRam() < val);
    }

    public void findByStorage(Integer val) {
        resList.removeIf(nb -> nb.getStorage() < val);
    }

    public void findByOS(String val) {
        resList.removeIf(nb -> !nb.getOs().equalsIgnoreCase(val));
    }

    public void findByColor(String val) {
        resList.removeIf(nb -> !nb.getColor().equalsIgnoreCase(val));
    }

    public void resetResult(){
        resList = list;
    }

    public ArrayList<Notebook> getResList() {
        return resList;
    }
}
