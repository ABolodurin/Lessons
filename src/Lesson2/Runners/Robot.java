package Lesson2.Runners;

public class Robot implements RunAndJump {

    private static final int JUMP_HEIGHT = 2000;
    private static final int RUN_STAMINA = 1500;
    private final String name;
    private int currentStamina;
    private final int jumpHeight;

    public Robot(String name) {
        this.name = name;
        this.jumpHeight = JUMP_HEIGHT;
        currentStamina = RUN_STAMINA;
    }

    @Override
    public void rest() {
        currentStamina = RUN_STAMINA;
    }

    @Override
    public boolean run(int distance) {
        setCurrentStamina(getCurrentStamina()-distance);
        return getCurrentStamina() >= 0;
    }

    public int getCurrentStamina() {
        return currentStamina;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public String getName() {
        return name;
    }

    private void setCurrentStamina(int stamina){
        this.currentStamina = stamina;
    }

}
