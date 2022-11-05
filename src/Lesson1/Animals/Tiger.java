package Lesson1.Animals;

public class Tiger extends Cat {
    private static int tigerCount = 0;
    private static final int TIGER_RUN_DISTANCE = 800;

    public static int getTigerCount() {
        return tigerCount;
    }

    public Tiger(String name) {
        super(name, TIGER_RUN_DISTANCE);
        tigerCount++;
    }
}
