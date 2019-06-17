package ru.my.patterns.creational.factory;

public class Factory {

    public static void main(String[] args) {
        FishFactory fishFactory = new FishFactory();
        HumanFactory humanFactory = new HumanFactory();
        humanFactory.go();
        fishFactory.swim();
    }

}
