package Lesson2.Obstacles;

public class RunningTrack implements Obstacle {
    private int distance;

    public int getDistance() {
        return distance;
    }

    public RunningTrack(int metersDistance) {
        this.distance = metersDistance;
    }
}
