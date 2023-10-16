package org.example.lect3_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Apple> contentAppleBox= new ArrayList<>();
        for (int i = 0; i < 58; i++) {
            contentAppleBox.add(new Apple());
        }
        ArrayList<Orange> contentOrangeBox= new ArrayList<>();
        for (int i = 0; i < 43; i++) {
            contentOrangeBox.add(new Orange());
        }
        Box<Apple> appleBox = new Box<>(new Apple() ,contentAppleBox, 59.5f);
        Box<Orange> orangeBox = new Box<>(new Orange(), contentOrangeBox,66.5f);

        System.out.printf("Weight of box with apples: %.1f\n", appleBox.getWeight());
        System.out.printf("Weight of box with oranges: %.1f\n", orangeBox.getWeight());

        if(appleBox.compareBoxes(orangeBox)) System.out.println("Weight of compared boxes is similar");
        else System.out.println("Weight of compared boxes is not similar");

        ArrayList<Apple> contentAppleBox2= new ArrayList<>();
        for (int i = 0; i < 63; i++) {
            contentAppleBox2.add(new Apple());
        }
        ArrayList<Orange> contentOrangeBox2= new ArrayList<>();
        for (int i = 0; i < 53; i++) {
            contentOrangeBox2.add(new Orange());
        }
        Box<Apple> appleBox2 = new Box<>(new Apple() ,contentAppleBox2, 64.5f);
        Box<Orange> orangeBox2 = new Box<>(new Orange(), contentOrangeBox2,55.0f);

        appleBox.pourOver(appleBox2);
        orangeBox.pourOver(orangeBox2);

        System.out.printf("Apples in box1: %d; in box2: %d\n", appleBox.content.size(), appleBox2.content.size());
        System.out.printf("Oranges in box1: %d; in box2: %d\n", orangeBox.content.size(), orangeBox2.content.size());
    }
}
