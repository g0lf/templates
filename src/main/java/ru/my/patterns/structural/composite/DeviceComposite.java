package ru.my.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class DeviceComposite implements Device {

    private List<Device> devices = new ArrayList<Device>();

    public void turnOn() {
        for (Device d : devices){
            d.turnOn();
        }
    }

    public void turnOff() {
        for (Device d : devices){
            d.turnOff();
        }
    }

    public void addDevice(Device device){
        devices.add(device);
    }

    public void removeDeveice(Device device){
        devices.remove(device);
    }
}
