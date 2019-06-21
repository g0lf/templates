package ru.my.patterns.structural.bridge;

public class Il86 extends Vehicle {

    public Il86(Layout layout) {
        super(layout);
    }

    void build() {
        System.out.println("Building IL-86...");
        layout.makeLayout();
    }

    void release() {
        System.out.println("Releasing IL-86...");
    }
}
