package ru.my.patterns.structural.adapter;

public class KitchenPipe implements WaterPipe {

    public void getHotWater() {
        System.out.println("Feed hot water on kitchen...");
    }

    public void getColdWater() {
        System.out.println("Feed cold water on kitchen...");
    }
}
