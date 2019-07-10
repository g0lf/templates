package ru.my.patterns.behavioral.memento;

/**
 * шаблон проектирования, позволяющий,
 * не нарушая инкапсуляцию, зафиксировать и сохранить
 * внутреннее состояние объекта так, чтобы позднее восстановить его в это состояние.
 */
public class Example {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        originator.setState(2);
        System.out.println(originator.getState());

        caretaker.setMemento(originator.saveState());
        originator.setState(4);
        System.out.println(originator.getState());

        originator.restoreState(caretaker.getMemento());
        System.out.println(originator.getState());
    }

}
