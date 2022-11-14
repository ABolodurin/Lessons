package Lesson2.Obstacles;

import Lesson2.Runners.RunAndJump;

public class Wall implements Obstacle {
    private final int height;

    public Wall(int centimetersHeight) {
        this.height = centimetersHeight;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean attemptToPass(RunAndJump contestant) {
        if (getHeight() <= contestant.getJumpHeight()) {
            System.out.printf("%s перепрыгнул препядствие%n", contestant.getName());
            return true;
        } else {
            System.out.printf("%s не смог перепрыгнуть препядствие%n", contestant.getName());
            return false;
        }
    }
}
