package ru.my.patterns.structural.bridge;

public class Bus extends Vehicle {

    public Bus(Layout layout) {
        super(layout);
    }

    void build() {
        System.out.println("Building bus...");
        layout.makeLayout();
    }

    void release() {
        System.out.println("Releasing bus...");
    }
}
