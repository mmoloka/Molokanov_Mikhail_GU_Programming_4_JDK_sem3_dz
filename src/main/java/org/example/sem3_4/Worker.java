package org.example.sem3_4;

public class Worker implements Person{
    @Override
    public void doWork() {
        System.out.println("Working hard!");
    }

    @Override
    public void haveRest() {
        System.out.println("Can't stop working");
    }
}
