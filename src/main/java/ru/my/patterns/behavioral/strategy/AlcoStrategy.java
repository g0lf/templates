package ru.my.patterns.behavioral.strategy;

public class AlcoStrategy implements PickUpStrategy {
    @Override
    public void execute() {
        System.out.println("I will buy cocktail for you");
    }
}
