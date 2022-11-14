package Lesson4;

import Lesson4.Fruits.Apple;
import Lesson4.Fruits.Orange;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[]{1, 2, 3, 4, 5, 6};
        swapElements(intArray, 2, 3);
        for (Integer element : intArray) {
            System.out.printf("%d, ", element);
        }
        System.out.println();

        ArrayList<Integer> arrayList = toArraylist(intArray);
        System.out.println(arrayList);

        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange(), new Orange());
        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple(), new Apple(), new Apple());
        System.out.println(orangeBox.compareTo(appleBox));

        Box<Apple> appleBox1 = new Box<>();
        appleBox.moveTo(appleBox1);
        System.out.printf("%f %f", appleBox.getWeight(), appleBox1.getWeight());

    }

    public static <A> void swapElements(A[] array, int index1, int index2) {
        A temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static <A> ArrayList<A> toArraylist(A[] array) {
        ArrayList<A> arrayList = new ArrayList<>(array.length);
        Collections.addAll(arrayList, array);
        return arrayList;
    }


}
