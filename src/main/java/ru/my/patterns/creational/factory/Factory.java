package ru.my.patterns.creational.factory;

/**
 *  порождающий шаблон проектирования, предоставляет интерфейс
 *  для создания семейств взаимосвязанных или
 *  взаимозависимых объектов, не специфицируя их конкретных классов.
 */
public class Factory {

    public static void main(String[] args) {
        FishFactory fishFactory = new FishFactory();
        HumanFactory humanFactory = new HumanFactory();
        humanFactory.go();
        fishFactory.swim();
    }

}
