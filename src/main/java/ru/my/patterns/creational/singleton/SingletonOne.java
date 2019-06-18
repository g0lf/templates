package ru.my.patterns.creational.singleton;

/**
 * — порождающий шаблон проектирования, гарантирующий,
 * что в однопроцессном приложении будет
 * единственный экземпляр некоторого класса, и предоставляющий глобальную точку доступа к этому экземпляру.
 */
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
