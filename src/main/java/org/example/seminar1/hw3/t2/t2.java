package org.example.seminar1.hw3.t2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        Items items = new Items("Сыр Великославич", "Россия", 200, 230, 1);
        Items items2 = new Items("Сосиски Высший вкус","Россия", 200,  340, 2);
        Items items3 = new Items("Молоко деревенское","Россия", 200,  80, 1);
        Items items4 = new Items("Пельмени Высший вкус","Россия", 200,  260, 1);
        Items items5 = new Items("Чай Иван-чай","Россия", 200,  80, 3);
        Items items6 = new Items("Груши Конференция","Азербайджан", 200,  120, 3);
        Items items7 = new Items("Лаваш Армянский","Россия", 200,  50, 4);

        List<Items> itemsList = new ArrayList<>();
        itemsList.add(items);
        itemsList.add(items2);
        itemsList.add(items3);
        itemsList.add(items4);
        itemsList.add(items5);
        itemsList.add(items6);
        itemsList.add(items7);

        System.out.println(itemsList);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сорта для поиска через пробел: ");
        List<String> input = Arrays.asList(scanner.nextLine().split(" "));
        List<Integer> findSort = input.stream().mapToInt(Integer::parseInt).boxed().toList();
        System.out.println("Ищем товары с минимальной стоимостью, " + findSort + " сорта");
        int minCost = 0;
        List<String> products = new ArrayList<>();

        for (Items item : itemsList) {
            String name = item.getName();
            Integer sort = item.getSort();
            int cost = item.getCost();

            if (findSort.contains(sort)) {
                if (products.isEmpty()) {
                    minCost = cost;
                    products.add(name);
                } else if (cost < minCost) {
                    products.clear();
                    minCost = cost;
                    products.add(name);
                } else if (cost == minCost) {
                    products.add(name);
                }
            }
        }
        System.out.println("Найдены товары " + findSort + " сорта, стоимостью " + minCost + ":");
//        System.out.println(products);
        products.forEach(System.out::println);
    }
}
