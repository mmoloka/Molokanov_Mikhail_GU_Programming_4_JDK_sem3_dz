package org.example.sem3_3;

import org.example.sem3_2.MyCollection;

/*
Написать итератор по массиву. Итератор - это объект, осуществляющий движение по коллекциям любого типа,
содержащим любые типы данных. Итераторы обычно имеют только два метода - проверка на наличие следующего
элемента и переход к следующему элементу. Но также особенно в других языках программирования, возможно встретить
итераторы, реализующие дополнительну логику.

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
        doubleMyCollection.add(3.84);
        doubleMyCollection.add(4.48);
        doubleMyCollection.add(1.23);
        doubleMyCollection.add(3.22);

        for (Double item: doubleMyCollection) {
            System.out.print(item + " ");
        }
    }
}
