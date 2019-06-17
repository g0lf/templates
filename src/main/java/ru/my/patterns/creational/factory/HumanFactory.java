package ru.my.patterns.creational.factory;

import java.util.ArrayList;
import java.util.List;

public class HumanFactory implements AbstractBeingFactory {

    private List<PartOfBody> parts;

    public HumanFactory() {
        this.parts = new ArrayList<PartOfBody>();
        parts.add(new Leg());
        parts.add(new Head());
        parts.add(new Hand());
    }

    public void go() {
        System.out.println("I am going...");
    }

    public void sit() {
        System.out.println("I am sitting...");
    }

    public void hunt() {
        System.out.println("I am hunting...");
    }

    public void swim() {
        System.out.println("I am swimming...");
    }
}
