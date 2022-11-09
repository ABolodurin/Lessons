package Lesson3.MyExceptions;

public class MyArrayDataException extends RuntimeException{
    private int row;
    private int column;
    private String[][] array;

    public MyArrayDataException(int row, int column, String[][] array) {
        super("Invalid data in [" + row + "; " + column + "]: " + array[row][column]);
        this.row = row;
        this.column = column;
        this.array = array;
    }
}
