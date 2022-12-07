package Lesson8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("a", "a", "a", "b", "b", "c", "e", "f", "f", "f", "f", "f");
        words.stream()
                .distinct()
                .sorted((word1, word2) -> (int) ((words.stream()
                        .filter(w -> w.equals(word2))
                        .count()) - (words.stream()
                        .filter(w -> w.equals(word1))
                        .count())))
                .limit(1)
                .forEach(System.out::println);

        List<Employee> employees = Arrays.asList(
                new Employee("Andy", 23, 500),
                new Employee("Andrew", 54, 750),
                new Employee("Max", 33, 9999),
                new Employee("Alex", 31, 0),
                new Employee("Misha", 28, 1000),
                new Employee("Cat", 8, 10));
        OptionalDouble average = employees.stream()
                .mapToInt(Employee::getSalary)
                .average();
        System.out.println(average);

        int N = 3;
        String prefix = N + " самых старших сотрудников зовут: ";
        System.out.println(employees.stream()
                        .sorted((e1, e2) -> e2.getAge() - e1.getAge())
                        .limit(N)
                        .map(Employee::getName)
                .collect(Collectors.joining(", ", prefix, ";")));


    }
}
