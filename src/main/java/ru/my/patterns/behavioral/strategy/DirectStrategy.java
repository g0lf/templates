package ru.my.patterns.behavioral.strategy;

public class DirectStrategy implements PickUpStrategy {
    @Override
    public void execute() {
        System.out.println("Will you sleep eith me?");
    }
}
