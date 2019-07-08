package ru.my.patterns.behavioral.observer;

public class InfoScreen implements Observer {

    private SatelliteQuakeData satelliteQuakeData;

    private String coordinates;
    private int status;
    private int direction;

    private int quakeCountInCurrentMoment;
    private boolean dangerLevel;

    public InfoScreen(SatelliteQuakeData satelliteQuakeData) {
        this.satelliteQuakeData = satelliteQuakeData;
        satelliteQuakeData.addObserver(this);
    }

    @Override
    public void updateTechScreen(String coordinates, int status, int direction) {
        this.coordinates = coordinates;
        this.status = status;
        this.direction = direction;
        System.out.println("Update tech screen data...");
    }

    @Override
    public void updateUserScreen(int quakeCountInCurrentMoment, boolean dangerLevel) {
        this.quakeCountInCurrentMoment = quakeCountInCurrentMoment;
        this.dangerLevel = dangerLevel;
        System.out.println("Update info screen data...");
    }
}
