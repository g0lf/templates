package ru.my.patterns.structural.composite;

/**
 *  структурный шаблон проектирования,
 *  объединяющий объекты в древовидную структуру
 *  для представления иерархии от частного к целому.
 *  Компоновщик позволяет клиентам обращаться к отдельным объектам и к группам объектов одинаково.
 */
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
