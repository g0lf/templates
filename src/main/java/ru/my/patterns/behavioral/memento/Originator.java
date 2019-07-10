package ru.my.patterns.behavioral.memento;

public class Originator {

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Memento saveState(){
        return new Memento(state);
    }

    public void restoreState(Memento memento){
        this.state = memento.getState();
    }
}
