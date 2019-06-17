package ru.my.patterns.creational.prototype;

public class Soldier implements CloneWarrior {

    public void attack() {
        System.out.println("Attack with laser...");
    }

    @Override
    public Soldier clone() throws CloneNotSupportedException {
        System.out.println("Make clone...");
        return (Soldier) super.clone();
    }
}
