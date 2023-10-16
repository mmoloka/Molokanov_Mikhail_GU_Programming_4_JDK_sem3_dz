package org.example.sem3_3;

import org.example.sem3_2.MyCollection;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {
    private  final MyCollection<T> collection;
    private int index = 0;

    public MyIterator(MyCollection<T> collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return index < collection.getSize();
    }

    @Override
    public T next() {
        T item = collection.getByIndex(index);
        index++;
        return item;
    }
}
