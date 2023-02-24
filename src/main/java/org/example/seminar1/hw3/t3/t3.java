package org.example.seminar1.hw3.t3;

import java.util.ArrayList;
import java.util.List;

public class t3 {
    public static void main(String[] args) {
        Items items = new Items("Generation П", "Пелевин", 540, 1999, 352);
        Items items2 = new Items("Духless","Минаев", 500,  2008, 352);
        Items items3 = new Items("Гиперболоид инженера Гарина","Толстой", 9680,  2018, 296);
        Items items4 = new Items("Две жизни","Антарова", 2728,  2022, 1129);
        Items items5 = new Items("Слипер и дример","Чёрт", 685,  2012, 575);
        Items items6 = new Items("Бойцовский клуб","Паланик", 730,  2021, 288);

        List<Items> itemsList = new ArrayList<>();
        itemsList.add(items);
        itemsList.add(items2);
        itemsList.add(items3);
        itemsList.add(items4);
        itemsList.add(items5);
        itemsList.add(items6);

        System.out.println(itemsList);

        int yearFrom = 2010;
        String authorContain = "А";
        List<String> books = new ArrayList<>();

        for (Items item : itemsList) {
            String title = item.getTitle();
            String author = item.getAuthor();
            Integer pages = item.getPageCount();
            Integer year = item.getYear();
//            System.out.println(sort + " ; " + findSort.contains(sort) + " ; " + cost);

            if (author.contains(authorContain)
                    && year >= yearFrom
                    && checkPrime(pages)) {
                books.add(title);
            }
        }
        System.out.println("Найдены книги с простым количеством страниц, после " + yearFrom + " года, автор содержит (с учетом регистра) " + authorContain + ":");
        System.out.println(books);
    }
    private static boolean checkPrime(int num){
        if (num > 3) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) return false;
            }
        }
        return true;
    }
}
