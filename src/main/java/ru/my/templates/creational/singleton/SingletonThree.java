package ru.my.templates.creational.singleton;

public class SingletonThree {
    private static SingletonThree instance;
    private SingletonThree () {}

    //Этот вариант блокирует метод getInstance() вне зависимости от того,
    //создали ли мы единственный экземпляр или нет.
    //Это замедляет работу программы, если требуется часто получать объект Singleton из разных потоков.
    public static synchronized SingletonThree getInstance() {
        if (instance == null) {
            instance = new SingletonThree();
        }
        return instance;
    }
}
