package ru.my.patterns.structural.decorator;

public class BedroomDecorator extends RoomDecorator {

    public BedroomDecorator(IApartments apartments) {
        super(apartments);
    }

    public void build() {
        super.build();
        System.out.println("Build bedroom...");
    }
}
