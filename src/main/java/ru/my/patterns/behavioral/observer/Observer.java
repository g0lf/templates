package ru.my.patterns.behavioral.observer;

public interface Observer {

    void updateTechScreen(String coordinates, int status, int direction);

    void updateUserScreen(int quakeCountInCurrentMoment, boolean dangerLevel);

}
