package Lesson2.Runners;

import Lesson2.Obstacles.Passable;
import Lesson2.Obstacles.RunningTrack;

public interface Runnable extends Passable {
    boolean run(RunningTrack runningTrack, boolean continuing);

    void rest();
}
