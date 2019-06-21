package ru.my.patterns.structural.bridge;

public class Boeing extends Vehicle {

    public Boeing(Layout layout) {
        super(layout);
    }

    void build() {
        System.out.println("Building boeing...");
        layout.makeLayout();
    }

    void release() {
        System.out.println("Boeing releasing...");
    }
}
