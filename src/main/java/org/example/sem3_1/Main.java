package org.example.sem3_1;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/*
Создать обобщенный класс с тремя параметрами (T, V, K). Класс содержит три переменнные типа (T, V, K), конструктор,
принимающий на вход парметры типа (T, V, K), методы возвращаяющие значения трех переменных. Создать метод выводящий
на консоль имена классов для трех переменных класса. Наложить ограничения на параметры типа:
T должен реализовать интерфейс Comparable (классы оболочки, String),
V должен реализовать интерфейс DataInput и расширять класс InputStream,
K должен расширять класс Number.
 */
public class Main {
     public static void main(String[] args) throws FileNotFoundException {
          InputStream inputStream = new DataInputStream(new FileInputStream("test.txt"));
          FirstClass<String, DataInputStream, Integer> firstClass = new FirstClass<>("string",
                  new DataInputStream(inputStream), 3);
          firstClass.getNameClass();
     }

}
