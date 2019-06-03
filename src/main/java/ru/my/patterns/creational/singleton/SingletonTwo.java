package ru.my.patterns.creational.singleton;

public class SingletonTwo {
    private static SingletonTwo instance;

    static {
        instance = new SingletonTwo();
        // В этом блоке возможна обработка исключений
    }

    private SingletonTwo () {}

    public static SingletonTwo getInstance() {
        return instance;
    }
}
