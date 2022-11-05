package Lesson1.Animals;

public class Dog extends Animal{
    private static int dogCount = 0;
    private static final int DOG_RUN_DISTANCE = 500;
    private static final int DOG_SWIM_DISTANCE = 10;

    public static int getDogCount() {
        return dogCount;
    }

    public Dog(String name) {
        super(name, DOG_RUN_DISTANCE, DOG_SWIM_DISTANCE);
        dogCount++;
    }
}
