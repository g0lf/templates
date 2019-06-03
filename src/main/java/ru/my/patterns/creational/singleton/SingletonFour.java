package ru.my.patterns.creational.singleton;

public class SingletonFour {

    private static volatile SingletonFour instance;

    public static SingletonFour getInstance() {
        SingletonFour localInstance = instance;
        if (localInstance == null) {
            synchronized (SingletonFour.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new SingletonFour();
                }
            }
        }
        return localInstance;
    }

}
