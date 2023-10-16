package org.example.sem3_4;

/*
Описать интерфейс Person с методами doWork() и haveRest(). Написать два класса работник и бездельник, реализующих
интерфейс. Работник работает, и не умеет бездельничать, в то время как бездельник не умеет работать, но умеет отдыхать.
Написать обобщенные классы Workplace и Club, содержащие массив из Person. В классах необходимо вызывать у всего
массива людей соответствующие методы.
 */
public class Main {
    public static void main(String[] args) {
        Person person1 = new Worker();
        Person person2 = new Worker();
        Person person3 = new Worker();
        Person person4 = new Worker();
        Person person5 = new Worker();
        Person person6 = new Idle();
        Person person7 = new Idle();
        Person person8 = new Idle();
        Person person9 = new Idle();
        Person person10 = new Idle();

        Person[] workers = {person1, person7, person3, person9, person5};
        Person[] idles = {person6, person2, person8, person4, person10};

        WorkPlace<? extends Person> workPlace = new WorkPlace<>(workers);
        Club<? extends Person> club = new Club<>(idles);

        workPlace.workForAll();
        club.partyForAll();
    }
}
