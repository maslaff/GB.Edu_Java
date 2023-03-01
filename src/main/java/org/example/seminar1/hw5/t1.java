//Подсчитать количество вхождения каждого слова
//Пример:
//Россия идет вперед всей планеты. Планета — это не Россия.
//toLoverCase().

package org.example.seminar1.hw5;

import java.util.HashMap;
import java.util.Objects;

public class t1 {
    public static void main(String[] args) {
        String inputString = "Россия идет вперед всей планеты. Планета — это не Россия.";
        printHashMap(countWords(inputString));
    }
    public static void printHashMap(HashMap<String, Integer> hm){
        hm.forEach((k, v) -> System.out.println((v + ": " + k)));
    }
    public static HashMap<String, Integer> countWords(String srcString){
        HashMap<String, Integer> wordCount = new HashMap<>();

        String[] wordList = srcString.toLowerCase()
                .replaceAll("[^a-zа-яё0-9 ]", "")
                .replaceAll("ё", "е")
                .split(" ");
        for (String word : wordList) {
            if (!Objects.equals(word, ""))
                wordCount.put(word, wordCount.containsKey(word) ? wordCount.get(word) + 1 : 1);
        }
        return wordCount;
    }

}
