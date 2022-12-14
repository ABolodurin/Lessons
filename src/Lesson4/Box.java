package Lesson4;

import Lesson4.Fruits.Fruit;

import java.util.Arrays;
import java.util.LinkedList;

public class Box<T extends Fruit> {
    private final LinkedList<T> container;

    public Box() {
        container = new LinkedList<>();
    }

    public void add(T... fruits) {
        container.addAll(Arrays.asList(fruits));
    }

    public T remove() {
        T fruit = container.getFirst();
        container.remove(0);
        return fruit;
    }

    public float getWeight() {
        float weight = 0F;
        if (!(this.container.isEmpty())) {
            for (T fruit : this.container) {
                weight += fruit.getWeight();
            }
        }
        return weight;
    }

    public boolean compareTo(Box<? extends Fruit> another) {
        if (another == null) return false;
        return Math.abs(this.getWeight() - another.getWeight()) < 0.01F;
    }

    public void moveTo(Box<T> another) {
        while (!(this.container.isEmpty())) {
            another.add(this.remove());
        }
    }
}
