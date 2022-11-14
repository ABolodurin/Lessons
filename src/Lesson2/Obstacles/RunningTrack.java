package Lesson2.Obstacles;

import Lesson2.Runners.RunAndJump;

public class RunningTrack implements Obstacle {
    private final int distance;


    public RunningTrack(int metersDistance) {
        this.distance = metersDistance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public boolean attemptToPass(RunAndJump contestant) {
        if (contestant.run(getDistance())) {
            System.out.printf("%s пробежал участок %dм.%n", contestant.getName(), getDistance());
            return true;
        } else {
            System.out.printf("%s не смог пробежать участок %dм.%n", contestant.getName(), getDistance());
            return false;
        }
    }
}
