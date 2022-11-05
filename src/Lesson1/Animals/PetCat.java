package Lesson1.Animals;

public class PetCat extends Cat{
    private static int catCount = 0;

    public static int getCatCount() {
        return catCount;
    }

    public PetCat(String name) {
        super(name, 200);
        catCount++;
    }
}
