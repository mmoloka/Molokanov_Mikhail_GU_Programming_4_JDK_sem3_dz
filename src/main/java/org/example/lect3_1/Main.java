package org.example.lect3_1;

import java.util.Arrays;

public class Main {
    public static <T> void changeElementsPlace(T[] array, int first, int second) {
        if (first <= array.length - 1 && second <= array.length - 1) {
            T temp;
            temp = array[first];
            array[first] = array[second];
            array[second] = temp;
        } else {
            System.out.println("Not valid input data");
        }
    }

    public static void main(String[] args) {
        String[] strArray = {"Сергей", "Василий", "Михаил"};
        Double[] dblArray = {1.01, 2.02, 3.03};
        changeElementsPlace(strArray, 0, 2);
        changeElementsPlace(dblArray, 0, 2);
        System.out.println(Arrays.toString(strArray));
        System.out.println(Arrays.toString(dblArray));
    }
}