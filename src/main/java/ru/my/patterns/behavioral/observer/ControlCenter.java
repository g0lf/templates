package ru.my.patterns.behavioral.observer;

/**
 * Также известен как «подчинённые» (Dependents).
 * Реализует у класса механизм, который позволяет объекту этого класса
 * получать оповещения об изменении состояния других объектов и тем самым наблюдать за ними
 */
public class ControlCenter {

    public static void main(String[] args) {
        SatelliteQuakeData satelliteQuakeData = new SatelliteQuakeData();
        new InfoScreen(satelliteQuakeData);

        satelliteQuakeData.setInfoMeasurements(5, false);
        satelliteQuakeData.setTechMeasurements("55,76 45,77", 6, 8);



    }

}
