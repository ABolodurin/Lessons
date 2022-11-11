package Lesson2.Runners;


import Lesson2.Obstacles.Obstacle;
import Lesson2.Obstacles.RunningTrack;
import Lesson2.Obstacles.Wall;

public class Human implements RunAndJump {

    private final String name;

    private static final int JUMP_HEIGHT = 1500;
    private static final int RUN_STAMINA = 150;
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
    public boolean run(RunningTrack runningTrack) {
        currentStamina -= runningTrack.getDistance();
        if (currentStamina >= 0) {
            System.out.printf("%s пробежал участок %dм.%n", name, runningTrack.getDistance());
            return true;
        } else {
            System.out.printf("%s не смог пробежать участок %dм.%n", name, runningTrack.getDistance());
            return false;
        }

    }

    public Human(String name) {
        this.name = name;
        currentStamina = RUN_STAMINA;
    }

    @Override
    public boolean tryToPass(Obstacle obstacle) {
        if (obstacle instanceof Wall) {
            return jump((Wall) obstacle);
        } else if (obstacle instanceof RunningTrack) {
            return run((RunningTrack) obstacle);
        } else {
            System.out.println("error");
            return false;
        }
    }

    public int getCurrentStamina() {
        return currentStamina;
    }

    public String getName() {
        return name;
    }


}
