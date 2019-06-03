package ru.my.patterns.creational.singleton;

public class SingletonOne {

    private static SingletonOne instance = null;

    private SingletonOne(){

    }

    //ленивая инициализация
    public SingletonOne getInstance(){
        if (instance == null){
            instance = new SingletonOne();
        }
        return instance;
    }

}
