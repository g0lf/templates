package ru.my.patterns.structural.bridge;

public abstract class Vehicle {

    protected Layout layout;

    public Vehicle(Layout layout) {
        this.layout = layout;
    }

    abstract void build();
    abstract void release();

}
