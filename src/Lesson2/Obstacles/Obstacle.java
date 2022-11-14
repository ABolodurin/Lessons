package Lesson2.Obstacles;

import Lesson2.Runners.RunAndJump;

public interface Obstacle {
    boolean attemptToPass(RunAndJump contestant);
}
