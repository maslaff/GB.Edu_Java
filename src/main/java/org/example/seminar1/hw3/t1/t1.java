package org.example.seminar1.hw3.t1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class t1 {
    public static void main(String[] args) {
        Items items = new Items("Сыр Великославич", 230, 1);
        Items items2 = new Items("Сосиски Высший вкус", 340, 2);
        Items items3 = new Items("Молоко деревенское", 80, 1);
        Items items4 = new Items("Пельмени Высший вкус", 260, 1);
        Items items5 = new Items("Чай Иван-чай", 100, 4);
        Items items6 = new Items("Груши Конференция", 120, 3);
        Items items7 = new Items("Лаваш Армянский", 50, 4);

        List<Items> itemsList = new ArrayList<>();
        itemsList.add(items);
        itemsList.add(items2);
        itemsList.add(items3);
        itemsList.add(items4);
        itemsList.add(items5);
        itemsList.add(items6);
        itemsList.add(items7);

        System.out.println(itemsList);

        String searchName = "высший";
        Integer[] findSort = {1, 2};
        int maxCost = 0;

        for (Items item : itemsList) {
            String name = item.getName();
            int sort = item.getSort();

            if (name.toLowerCase().contains(searchName) && Arrays.asList(findSort).contains(sort)) {
                maxCost = Math.max(maxCost, item.getCost());
            }
        }
        System.out.println("Max cost " + maxCost);
    }
}
