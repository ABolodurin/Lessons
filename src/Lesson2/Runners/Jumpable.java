package Lesson2.Runners;

import Lesson2.Obstacles.Passable;
import Lesson2.Obstacles.Wall;

public interface Jumpable extends Passable {
    boolean jump(Wall wall);
}
