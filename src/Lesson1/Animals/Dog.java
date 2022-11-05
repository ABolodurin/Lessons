package Lesson1.Animals;

public class Dog extends Animal{
    private static int dogCount = 0;

    public static int getDogCount() {
        return dogCount;
    }

    public Dog(String name) {
        super(name, 500, 10);
        dogCount++;
    }
}
