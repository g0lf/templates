package ru.my.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class SatelliteQuakeData implements Observable {
    
    private List<Observer> observers = new ArrayList<>();
    
    private String coordinates;
    private int status;
    private int direction;
    
    private int quakeCountInCurrentMoment;
    private boolean dangerLevel;

    public void setTechMeasurements(String coordinates, int status, int direction){
        this.coordinates = coordinates;
        this.status = status;
        this.direction = direction;
        notifyObservers();
    }

    public void setInfoMeasurements(int quakeCountInCurrentMoment, boolean dangerLevel){
        this.quakeCountInCurrentMoment = quakeCountInCurrentMoment;
        this.dangerLevel = dangerLevel;
        notifyObservers();
    }
    
    
    @Override
    public void addObserver(Observer o) {
        observers.add(o);        
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers){
            o.updateTechScreen(coordinates, status, direction);
            o.updateUserScreen(quakeCountInCurrentMoment, dangerLevel);
        }
    }
}
