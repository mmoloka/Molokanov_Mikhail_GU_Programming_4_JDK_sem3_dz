package org.example.sem3_4;

public class Idle implements Person {
    @Override
    public void doWork() {
        System.out.println("I don't want to work!");
    }

    @Override
    public void haveRest() {
        System.out.println("Party hard!");
    }
}
