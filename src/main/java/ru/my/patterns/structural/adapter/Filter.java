package ru.my.patterns.structural.adapter;

public class Filter implements IFilter {

    private WaterPipe waterPipe;

    public Filter(WaterPipe waterPipe) {
        this.waterPipe = waterPipe;
    }

    public void getFilteredWater() {
        waterPipe.getColdWater();
        System.out.println("Make filtering...");
    }
}
