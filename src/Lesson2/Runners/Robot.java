package Lesson2.Runners;

import Lesson2.Obstacles.RunningTrack;
import Lesson2.Obstacles.Wall;

public class Robot implements Runnable, Jumpable {

    private String name;

    private static final int JUMP_HEIGHT = 2000;
    private static final int RUN_STAMINA = 1500;
    private int currentStamina;

    @Override
    public void rest() {
        currentStamina = RUN_STAMINA;
    }

    @Override
    public boolean jump(Wall wall) {
        if (wall.getHeight() <= JUMP_HEIGHT) {
            System.out.printf("%s перепрыгнул препядствие%n", name);
            return true;
        } else {
            System.out.printf("%s не смог перепрыгнуть препядствие%n", name);
            return false;
        }
    }

    @Override
    public boolean run(RunningTrack runningTrack, boolean continuing) {
        if (!continuing) rest();

        currentStamina -= runningTrack.getDistance();
        if (currentStamina >= 0) {
            System.out.printf("%s пробежал участок %dм.%n", name, runningTrack.getDistance());
            return true;
        } else {
            System.out.printf("%s не смог пробежать участок %dм.%n", name, runningTrack.getDistance());
            return false;
        }


    }

    public Robot(String name) {
        this.name = name;
        rest();
    }

    public String getName() {
        return name;
    }


}
