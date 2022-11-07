package Lesson2.Obstacles;

import Lesson2.Runners.Jumpable;
import Lesson2.Runners.Runnable;

public interface Passable {
    default boolean pass(Obstacle obstacle) {
        if (obstacle instanceof Wall) {
            return ((Jumpable) this).jump((Wall) obstacle);
        } else if (obstacle instanceof RunningTrack) {
            return ((Runnable) this).run((RunningTrack) obstacle, true);
        } else {
            System.out.println("error");
            return false;
        }
    }
}
