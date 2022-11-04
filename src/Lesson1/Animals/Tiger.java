package Lesson1.Animals;

public class Tiger extends Cat{
    private static int tigerCount = 0;

    public static int getTigerCount() {
        return tigerCount;
    }

    public Tiger(String name, int maxRunDistance) {
        super(name, maxRunDistance);
        tigerCount++;
    }
}
