package org.example.sem3_5;

import org.example.sem3_2.MyCollection;
import org.example.sem3_3.MyIterator;
import org.example.sem3_4.Person;

import java.util.Iterator;

public class Club<T extends Person> implements Iterable<T>{
    private T[] community;

    public Club(T[] community) {
        this.community = community;
    }

    public void partyForAll() {
        for (T person: community) {
            person.haveRest();
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<T>();
    }

    class MyIterator<T> implements Iterator<T> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < community.length;
        }

        @Override
        public T next() {
            T item = (T)community[index];
            index++;
            return item;
        }
    }
}
