package ru.my.templates.creational.singleton;

public class SingletonOne {

    public static SingletonOne instance = null;

    private SingletonOne(){

    }

    public SingletonOne getInstance(){
        if (instance == null){
            instance = new SingletonOne();
        }
        return instance;
    }

}
