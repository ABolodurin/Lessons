package Lesson3.MyExceptions;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException() {
        super("Array size must be [4][4]");
    }
}
