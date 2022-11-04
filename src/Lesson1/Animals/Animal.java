package Lesson1.Animals;

public abstract class Animal {
    protected String name;
    protected int maxRunDistance;
    protected int maxSwimDistance;

    protected static int animalCount = 0;

    public static int getAnimalCount() {
        return animalCount;
    }

    public Animal(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        animalCount++;
    }

    public void run(int distance) {
        int runDistance = distance < maxRunDistance ? distance : maxRunDistance;
        System.out.printf("%s пробежал %d м.%n", name, runDistance);
    }

    public void swim(int distance) {
        if (maxSwimDistance < 0)
            System.out.printf("%s не умеет плавать%n", name);
        else {
            int swimDistance = distance < maxSwimDistance ? distance : maxSwimDistance;
            System.out.printf("%s проплыл %d м.%n", name, swimDistance);
        }
    }
}
