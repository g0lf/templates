package ru.my.patterns.creational.factory;


import java.util.ArrayList;
import java.util.List;

public class FishFactory implements AbstractBeingFactory {

    private List<PartOfBody> parts;

    public FishFactory() {
        this.parts = new ArrayList<PartOfBody>();
        parts.add(new Tail());
        parts.add(new Head());
        parts.add(new Plank());
    }

    public void go() {
        throw new RuntimeException();
    }

    public void sit() {
        throw new RuntimeException();
    }

    public void hunt() {
        System.out.println("I am hunting...");
    }

    public void swim() {
        System.out.println("I am swimming...");
    }
}
