package org.example.sem3_2;

/*
Описать собственную коллекцию - список на основе массива.
Коллекция должна иметь возможность хранить любые типы данных, иметь методы добавления и удаления элементов.
 */

public class Main {
    public static void main(String[] args) {
        MyCollection<Double> doubleMyCollection = new MyCollection<>(new Double[10]);
        doubleMyCollection.print();
        System.out.println();

        doubleMyCollection.add(3.14);
        doubleMyCollection.add(5.89);
        doubleMyCollection.add(1.45);
        doubleMyCollection.add(7.42);
        doubleMyCollection.print();
        System.out.println();

        doubleMyCollection.delete(2);
        doubleMyCollection.print();
        System.out.println();
    }
}
