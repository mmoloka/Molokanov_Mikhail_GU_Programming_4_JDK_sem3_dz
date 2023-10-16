package org.example.sem3_7;
/*
Напишите обобщенный мето compareArrays(), который принимает два массива и возвращает true, если они одинаковые, и
false в противном случае. Массивы могут быть любого типа данных, но должны иметь одинаковую длинну и содержать
элементы одного типа.
 */
public class Main {
    public static void main(String[] args) {
        String[] array1 = {"a", "33", "h"};
        String[] array2 = {"a", "3", "h"};
        String[] array3 = {"a", "33", "h"};
        Integer[] array4 = {1, 2, 3};

        System.out.println(compareArrays(array1, array2));
        System.out.println(compareArrays(array1, array3));
        System.out.println(compareArrays(array1, array4));
    }

    public static <T, S> boolean compareArrays(T[] array1, S[] array2) {
        for (int i = 0; i < array1.length; i++) {
            if(!array1[i].equals(array2[i])) return false;
        }
        return true;
    }
}
