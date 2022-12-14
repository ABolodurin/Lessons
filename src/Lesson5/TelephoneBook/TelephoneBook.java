package Lesson5.TelephoneBook;

import java.util.HashMap;
import java.util.HashSet;

public class TelephoneBook {
    private final HashMap<String, HashSet<String>> book;

    public TelephoneBook() {
        book = new HashMap<>();
    }

    public void get(String surname) {
        System.out.println("phones for " + surname + ": " + book.get(surname));
    }

    public void add(String surname, String phoneNumber) {
        checkNumber(phoneNumber);
        if (!(book.containsKey(surname))) book.put(surname, new HashSet<>());
        book.get(surname).add(phoneNumber);
    }

    private void checkNumber(String phoneNumber){
        String regex = "\\d*";
        if (phoneNumber.length() != 11 || !(phoneNumber.matches(regex)))
            throw new TelephoneBookException("incorrect phone number format: " + phoneNumber);
    }

}
