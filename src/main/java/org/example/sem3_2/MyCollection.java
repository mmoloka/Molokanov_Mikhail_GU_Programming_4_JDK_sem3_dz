package org.example.sem3_2;

import org.example.sem3_3.MyIterator;

import java.util.Iterator;

public class MyCollection <T> implements Iterable<T> {
    private  T[] array;
    private int index = 0;
    private  int size;

    public MyCollection(T[] array) {
        this.array = array;
        this.size = array.length;
    }

    public void add(T item) {
        if(index < size) {
            array[index] = item;
            index++;
        } else throw new RuntimeException("Array is full!");
    }

    public void delete(int index) {
        array[index] = null;
    }

    public void print() {
        for(T t: array) {
            System.out.print(t + " ");
        }
    }

    public T getByIndex(int index) {
        return array[index];
    }

    public int getSize() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<>(this);
    }
}
