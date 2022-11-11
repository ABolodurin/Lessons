package Lesson2.Runners;

import Lesson2.Obstacles.Obstacle;
import Lesson2.Obstacles.RunningTrack;
import Lesson2.Obstacles.Wall;

public interface RunAndJump {
    boolean run(RunningTrack runningTrack);
    boolean jump(Wall wall);
    boolean tryToPass(Obstacle obstacle);
    void rest();
}
