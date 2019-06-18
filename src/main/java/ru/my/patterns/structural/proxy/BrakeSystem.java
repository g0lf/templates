package ru.my.patterns.structural.proxy;

public class BrakeSystem implements IBrake {
    public void push() {
        System.out.println("Brake was pushed...");
    }

    public void release() {
        System.out.println("Brake was released...");
    }
}
