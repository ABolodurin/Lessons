package Lesson1.Animals;

public class PetCat extends Cat{
    private static int catCount = 0;
    private static final int PET_CAT_RUN_DISTANCE = 200;

    public static int getCatCount() {
        return catCount;
    }

    public PetCat(String name) {
        super(name, PET_CAT_RUN_DISTANCE);
        catCount++;
    }
}
