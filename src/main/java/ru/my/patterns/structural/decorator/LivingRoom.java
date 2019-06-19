package ru.my.patterns.structural.decorator;

public class LivingRoom extends RoomDecorator {
    public LivingRoom(IApartments apartments) {
        super(apartments);
    }

    public void build(){
        super.build();
        System.out.println("Build living room...");
    }


}
