package ru.my.patterns.creational.prototype;

public class ArmorWarrior implements CloneWarrior {

    public void attack() {
        System.out.println("Attack with super gun...");
    }

    @Override
    public ArmorWarrior clone() throws CloneNotSupportedException {
        System.out.println("Make clone...");
        return (ArmorWarrior) super.clone();
    }

}
