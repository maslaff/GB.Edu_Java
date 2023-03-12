package org.example.oop.hw2;

import java.util.*;

public class Main {
    static PCShop shop = new PCShop(List.of(
            new Notebook("i2c", 4, 1024, "Ubuntu", "Silver"),
            new Notebook("i3cc", 8, 2048, "Mint", "Silver"),
            new Notebook("l2tp", 6, 256, "Debian", "Black"),
            new Notebook("r2d2", 2, 128, "Gentoo", "White"),
            new Notebook("sh1t", 4, 512, "Windows", "Red")
    ));

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean nxt = true;
        while (nxt) {
            shop.printQueryTypes();
            System.out.print("Выберите критерий поиска: ");
            int queryType = scanner.nextInt() - 1;

            switch (shop.getQueryTypes().get(queryType)) {
                case "RAM" -> {
                    System.out.print("Введите от какого объема RAM искать ("
                            + shop.getRamMin() + " - " + shop.getRamMax() + "): ");
                    shop.findByRAM(scanner.nextInt());
                }
                case "Storage" -> {
                    System.out.print("Введите от какого объема хранилища искать ("
                            + shop.getStorageMin() + " - " + shop.getStorageMax() + "): ");
                    shop.findByStorage(scanner.nextInt());
                }
                case "OS" -> {
                    ArrayList<String> osList = new ArrayList<>(shop.getOsList());
                    for (int i = 0; i < osList.size(); i++) {
                        System.out.println((i + 1) + ". " + osList.get(i));
                    }
                    System.out.print("Выберите какую ОС искать (" + "1" + " - " + osList.size() + "): ");
                    shop.findByOS(osList.get(scanner.nextInt() - 1));
                }
                case "Color" -> {
                    ArrayList<String> colorList = new ArrayList<>(shop.getColors());
                    for (int i = 0; i < colorList.size(); i++) {
                        System.out.println((i + 1) + ". " + colorList.get(i));
                    }
                    System.out.print("Выберите какой цвет искать (" + "1" + " - " + colorList.size() + "): ");
                    shop.findByColor(colorList.get(scanner.nextInt() - 1));
                }
            }
            System.out.println("Найдены следующие позиции: ");
            shop.getResList().forEach(System.out::println);
            System.out.print("Сделать еще выборку? (y, n): ");
            nxt = scanner.next().equalsIgnoreCase("y");
        }
    }
}
