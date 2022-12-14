package Lesson3;

import Lesson3.MyExceptions.MyArrayDataException;
import Lesson3.MyExceptions.MyArraySizeException;

public class Main {
    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3", "3"},
                {"4", "5", "6", "7"},
                {"7", "8", "9", "3"},
                {"7", "8", "g", "3"}};
        try {
            System.out.println(getSumFromArray(array));
        } catch (MyArraySizeException | MyArrayDataException myException) {
            System.out.println(myException.getMessage());
        }
    }

    public static int getSumFromArray(String[][] array) {
        int rowSize = array.length;
        int columnSize = array[rowSize - 1].length;
        if (rowSize != 4 || columnSize != 4) {
            throw new MyArraySizeException();
        }
        for (String[] strings : array) {
            if (strings.length != 4) throw new MyArraySizeException();
        }

        int sum = 0;
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, array);
                }
            }
        }
        return sum;
    }
}
