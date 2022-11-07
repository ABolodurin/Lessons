package Lesson2;

import Lesson2.Obstacles.Obstacle;
import Lesson2.Obstacles.Passable;
import Lesson2.Obstacles.RunningTrack;
import Lesson2.Obstacles.Wall;
import Lesson2.Runners.Cat;
import Lesson2.Runners.Human;
import Lesson2.Runners.Robot;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Obstacle> obstacles = Arrays.asList(
                new RunningTrack(40),
                new Wall(700),
                new RunningTrack(40),
                new Wall(700),
                new RunningTrack(40),
                new Wall(1000),
                new RunningTrack(40),
                new Wall(1500),
                new RunningTrack(40),
                new Wall(2000),
                new RunningTrack(40),
                new Wall(700)
        );

        List<Passable> runners = Arrays.asList(
                new Cat("Andrew"),
                new Human("RK-07/7"),
                new Robot("Mark.Z")
        );

        boolean isPassed;
        for (Passable runner : runners) {
            for (Obstacle o : obstacles) {
                isPassed = runner.pass(o);
                if (!isPassed) break;
            }
        }

    }
}
