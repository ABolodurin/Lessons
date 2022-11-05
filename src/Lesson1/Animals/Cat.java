package Lesson1.Animals;

public abstract class Cat extends Animal {

    private static final int NO_SWIM = -1;

    public Cat(String name, int maxRunDistance) {
        super(name, maxRunDistance, NO_SWIM);
    }
}
