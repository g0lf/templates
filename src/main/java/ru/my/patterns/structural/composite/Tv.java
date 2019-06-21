package ru.my.patterns.structural.composite;

public class Tv implements Device {
    public void turnOn() {
        System.out.println("Tv was turned on...");
    }

    public void turnOff() {
        System.out.println("Tv was turned off...");
    }
}
