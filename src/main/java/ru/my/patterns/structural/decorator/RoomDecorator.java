package ru.my.patterns.structural.decorator;

public abstract class RoomDecorator implements IApartments {

    private IApartments apartments;

    public RoomDecorator(IApartments apartments) {
        this.apartments = apartments;
    }

    public void build(){
        apartments.build();
    }
}
