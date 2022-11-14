package Lesson5.TelephoneBook;

import java.util.HashMap;

public class TelephoneBook {
    private final HashMap<String, String> book;

    public TelephoneBook() {
        book = new HashMap<>();
    }

    public void get(String surname) {
        System.out.println("phones for " + surname + ": " + book.get(surname));
    }

    public void add(String surname, String phone79991234567) {
        try {
            double phone = Double.parseDouble(phone79991234567);
            if (phone < 10000000000L || phone > 99999999999L) {
                throw new TelephoneBookException("phone number must be 79991234567: " + phone79991234567);
            }
        } catch (NumberFormatException e) {
            throw new TelephoneBookException("phone number must be 79991234567: " + phone79991234567);
        }

        if (!(book.containsKey(surname))) {
            book.put(surname, phone79991234567);
        } else book.put(surname, book.get(surname) + ", " + phone79991234567);
    }


}
