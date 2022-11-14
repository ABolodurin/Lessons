package Lesson2.Runners;

public interface RunAndJump {
    int getCurrentStamina();

    int getJumpHeight();

    String getName();

    void rest();

    boolean run(int distance);
}
