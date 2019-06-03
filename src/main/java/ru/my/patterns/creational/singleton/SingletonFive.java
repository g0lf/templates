package ru.my.patterns.creational.singleton;

public class SingletonFive {

    //Невозможно использовать для не статических полей класса
    public static class SingletonHolder {
        public static final SingletonFive HOLDER_INSTANCE = new SingletonFive();
    }

    public static SingletonFive getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }

}
