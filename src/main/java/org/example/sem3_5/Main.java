package org.example.sem3_5;
/*
Внедрить итератор из задания 2 в коллекцию, написанную в задании 3 таким образом, чтобы итератор был внутренним
классом и соответственно, объектом в коллекции.
 */

import org.example.sem3_4.Person;
import org.example.sem3_4.Worker;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Worker();
        Person person2 = new Worker();
        Person person3 = new Worker();
        Person person4 = new Worker();
        Person person5 = new Worker();
        Person[] workers = {person1, person2, person3, person4, person5};

        for (Person worker: workers) {
            worker.doWork();
        }
    }
}
