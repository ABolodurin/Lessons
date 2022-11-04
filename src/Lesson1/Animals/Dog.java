package Lesson1.Animals;

public class Dog extends Animal{
    private static int dogCount = 0;

    public static int getDogCount() {
        return dogCount;
    }

    public Dog(String name, int maxRunDistance, int maxSwimDistance) {
        super(name, maxRunDistance, maxSwimDistance);
        dogCount++;
    }
}
