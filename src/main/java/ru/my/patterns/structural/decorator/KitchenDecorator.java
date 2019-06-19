package ru.my.patterns.structural.decorator;

public class KitchenDecorator extends RoomDecorator {

    public KitchenDecorator(IApartments apartments) {
        super(apartments);
    }

    public void build() {
        super.build();
        System.out.println("Build kitchen...");
    }
}
