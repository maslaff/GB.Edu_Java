package org.example.seminar1.vers;

import java.util.*;

public class T2 {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }
    public static Boolean isValid(String s) {
//        String input = "()[]{}";
        LinkedList<String> inputList = new LinkedList<>(Arrays.asList(s.split("")));
        System.out.println(inputList);
        int roundBrackets = 0;
        int squareBrackets = 0;
        int figureBrackets = 0;
        LinkedList<String> startBrackets = new LinkedList<>();
        int len = inputList.size();
// ([)]
        for (int i = 0; i < len; i++) {
            switch (inputList.pollFirst()) {
                case "(" -> roundBrackets++;
                case "[" -> squareBrackets++;
                case "{" -> figureBrackets++;
                case ")" -> {
                    if (--roundBrackets < 0) return false;
                }
                case "]" -> {
                    if (--squareBrackets < 0) return false;
                }
                case "}" -> {
                    if (--figureBrackets < 0) return false;
                }
            }
        }
        return roundBrackets == 0 && squareBrackets == 0 && figureBrackets == 0;
    }
}
