package org.example.lect3_2;

import java.util.ArrayList;

public class Box <T extends Fruit> {
    T unit;
    ArrayList<T> content;
    float weight;

    Box (T unit, ArrayList<T> content, float weight) {
        this.unit = unit;
        this.content = content;
        this.weight =weight;
    }

    public float getWeight() {
        return weight - (content.size() * unit.weight);
    }

    public <V extends Fruit> boolean compareBoxes(Box<V> box) {
        return getWeight() == box.getWeight();
    }

    public void pourOver(Box<T> toBox) {
        toBox.content.addAll(content);
        content.clear();
    }
}
