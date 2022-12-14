package Lesson8;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("a", "a", "a", "b", "b", "c", "e", "f", "f", "f", "f", "f");
        Map<String, Integer> wordsMap = new HashMap<>();
        words.forEach(w -> wordsMap.put(w,
                wordsMap.get(w) == null ? 1 : wordsMap.get(w) + 1));
        String resultKey = wordsMap.keySet().stream()
                .min((k1, k2) -> wordsMap.get(k2) - wordsMap.get(k1))
                .orElse(null);
        System.out.println(resultKey + " repeats " + wordsMap.get(resultKey) + " times");

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
        String PREFIX = N + " самых старших сотрудников зовут: ";
        String result = employees.stream()
                .sorted((e1, e2) -> e2.getAge() - e1.getAge())
                .limit(N)
                .map(Employee::getName)
                .collect(Collectors.joining(", ", PREFIX, ";"));
        System.out.println(result);


    }
}
