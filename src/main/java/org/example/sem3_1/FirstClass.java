package org.example.sem3_1;

import java.io.DataInput;
import java.io.InputStream;

public class FirstClass <T extends Comparable, V extends InputStream & DataInput, K extends Number> {
    T comparableItem;
    V dataItem;
    K numberItem;

    public FirstClass(T comparableItem, V dataItem, K numberItem) {
        this.comparableItem = comparableItem;
        this.dataItem = dataItem;
        this.numberItem = numberItem;
    }

    public FirstClass() {

    }

    public T getComparableItem() {
        return comparableItem;
    }

    public V getDataItem() {
        return dataItem;
    }

    public K getNumberItem() {
        return numberItem;
    }

    void getNameClass() {
        System.out.println(comparableItem.getClass().getName());
        System.out.println(dataItem.getClass().getName());
        System.out.println(numberItem.getClass().getName());
    }
}
