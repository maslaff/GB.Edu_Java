package org.example.seminar1.hw6;

import java.util.*;

public class Main {
    static Notebook n1 = new Notebook("i2c", 4, 1024, "Ubuntu", "Silver");
    static Notebook n2 = new Notebook("i3cc", 8, 2048, "Mint", "Silver");
    static Notebook n3 = new Notebook("l2tp", 6, 256, "Debian", "Black");
    static Notebook n4 = new Notebook("r2d2", 2, 128, "Gentoo", "White");
    static Notebook n5 = new Notebook("sh1t", 4, 512, "Windows", "Red");

    static ArrayList<Notebook> list = new ArrayList<>(Arrays.asList(n1, n2, n3, n4, n5));

    static ArrayList<String> queryTypes = new ArrayList<>(Arrays.asList("RAM", "Storage", "OS", "Color"));
//    static HashMap <String, String[]> queryTypes = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Notebook> resList = new ArrayList<>();

        for (int i = 0; i < queryTypes.size(); i++) {
            System.out.println((i+1) + ". " + queryTypes.get(i));
        }
        System.out.print("Выберите критерий поиска: ");
        int queryType = scanner.nextInt()-1;

        switch (queryTypes.get(queryType)) {
            case "RAM" -> {
                int max = list.get(0).getRam(), min = list.get(0).getRam();
                for (Notebook nb : list) {
                    int val = nb.getRam();
                    if (val > max) max = val;
                    else if (val < min) min = val;
                }
                System.out.print("Введите от какого объема RAM искать (" + min + " - " + max + "): ");
                resList = findByRAM(scanner.nextInt(), list);
            }
            case "Storage" -> {
                int max = list.get(0).getStorage(), min = list.get(0).getStorage();
                for (Notebook nb : list) {
                    int val = nb.getStorage();
                    if (val > max) max = val;
                    else if (val < min) min = val;
                }
                System.out.print("Введите от какого объема хранилища искать (" + min + " - " + max + "): ");
                resList = findByStorage(scanner.nextInt(), list);
            }
            case "OS" -> {
                HashSet<String> osSet = new HashSet<>();
                for (Notebook notebook : list) {
                    osSet.add(notebook.getOs());
                }
                ArrayList<String> osList = new ArrayList<>(osSet);
                for (int i = 0; i < osList.size(); i++) {
                    System.out.println((i + 1) + ". " + osList.get(i));
                }
                System.out.print("Выберите какую ОС искать (" + "1" + " - " + osList.size() + "): ");
                resList = findByOS(osList.get(scanner.nextInt() - 1), list);
            }
            case "Color" -> {
                HashSet<String> colorSet = new HashSet<>();
                for (Notebook notebook : list) {
                    colorSet.add(notebook.getColor());
                }
                ArrayList<String> colorList = new ArrayList<>(colorSet);
                for (int i = 0; i < colorList.size(); i++) {
                    System.out.println((i + 1) + ". " + colorList.get(i));
                }
                System.out.print("Выберите какой цвет искать (" + "1" + " - " + colorList.size() + "): ");
                resList = findByColor(colorList.get(scanner.nextInt() - 1), list);
            }
        }
        System.out.println("Найдены следующие позиции: ");
        resList.forEach(System.out::println);
    }
    private static ArrayList<Notebook> findByRAM(Integer val, ArrayList<Notebook> list) {
        ArrayList<Notebook> resList = new ArrayList<>();
        for (Notebook nb : list) {
            if (nb.getRam() >= val) resList.add(nb);
        }
        return resList;
    }

    private static ArrayList<Notebook> findByStorage(Integer val, ArrayList<Notebook> list) {
        ArrayList<Notebook> resList = new ArrayList<>();
        for (Notebook nb : list) {
            if (nb.getStorage() >= val) resList.add(nb);
        }
        return resList;
    }

    static ArrayList<Notebook> findByOS(String val, ArrayList<Notebook> list) {
        ArrayList<Notebook> resList = new ArrayList<>();
        for (Notebook nb : list) {
            if (nb.getOs().equalsIgnoreCase(val)) resList.add(nb);
        }
        return resList;
    }

    static ArrayList<Notebook> findByColor(String val, ArrayList<Notebook> list) {
        ArrayList<Notebook> resList = new ArrayList<>();
        for (Notebook nb : list) {
            if (nb.getColor().equalsIgnoreCase(val)) resList.add(nb);
        }
        return resList;
    }
}
