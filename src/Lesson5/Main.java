package Lesson5;

import Lesson5.TelephoneBook.TelephoneBook;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String words = "This version of the method also splits the string, but the maximum number of tokens can not exceed limit argument. After the method has found given the number of tokens, the rest of the unsplitted string is returned as the last token, even if it may contain the delimiters.";
        HashMap<String, Integer> uniqueWords = getUniqueWords(words);
        for (String key : uniqueWords.keySet()) {
            System.out.println(key + " " + uniqueWords.get(key));
        }

        TelephoneBook book = new TelephoneBook();
        book.add("Brun", "79991234567");
        book.add("Brun", "79991235467");
        book.add("dg", "79997054321");
        book.get("Brun");
    }

    public static HashMap<String, Integer> getUniqueWords(String source) {
        String[] data = source.toLowerCase().split(" ");
        String temp;
        HashMap<String, Integer> result = new HashMap<>();
        for (String s : data) {
            temp = s.replaceAll(",", "")
                    .replaceAll("\\.", "");
            if (!(result.containsKey(temp))) {
                result.put(temp, 1);
            } else {
                result.put(temp, result.get(temp) + 1);
            }
        }
        return result;
    }
}
