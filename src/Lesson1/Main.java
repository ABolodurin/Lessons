package Lesson1;

import Lesson1.Animals.Animal;
import Lesson1.Animals.Dog;
import Lesson1.Animals.PetCat;
import Lesson1.Animals.Tiger;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(
                new Dog("Вадик"),
                new PetCat("Артемий"),
                new Tiger("Игорян"),
                new Dog("Водяной"));

        for (Animal a :
                animals) {
            a.run(700);
            a.swim(15);
        }
        System.out.println();

        System.out.printf("Всего животных\t:\t%s.%n" +
                        "Домашних котов\t:\t%s.%n" +
                        "Тигров\t:\t%s.%n" +
                        "Собак\t:\t%s.%n", Animal.getAnimalCount(), PetCat.getCatCount(),
                Tiger.getTigerCount(), Dog.getDogCount());
    }
}
