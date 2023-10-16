package org.example.sem3_8;
/*
Напишите обобщенный класс Pair, который представляет собой пару значений разного типа. Класс должен иметь методы
getFirst(), getSecond() для получения значений пары, а также переопределение метда toString(), возвращающее строковое
представление пары.
 */
public class Main {
    public static void main(String[] args) {
        Pair<Double, Character> pair = new Pair<>(15.75, '~');
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);
    }
}

class Pair <T,E> {
    private final T first;
    private final E second;

    public Pair(T first, E second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "(" + first.toString() + ";" + second.toString() + ")";
    }
}
