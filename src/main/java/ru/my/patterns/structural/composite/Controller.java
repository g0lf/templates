package ru.my.patterns.structural.composite;

public class Controller {

    public static void main(String[] args) {
        DeviceComposite deviceComposite = new DeviceComposite();
        deviceComposite.addDevice(new Tv());
        deviceComposite.addDevice(new Computer());
        deviceComposite.addDevice(new Phone());

        deviceComposite.turnOn();

        deviceComposite.turnOff();
    }

}
