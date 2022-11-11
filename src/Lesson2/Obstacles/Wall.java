package Lesson2.Obstacles;

public class Wall implements Obstacle {
    private final int height;

    public int getHeight() {
        return height;
    }

    public Wall(int centimetersHeight) {
        this.height = centimetersHeight;
    }
}
