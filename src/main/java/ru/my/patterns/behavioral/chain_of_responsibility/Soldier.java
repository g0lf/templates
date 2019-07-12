package ru.my.patterns.behavioral.chain_of_responsibility;

public class Soldier extends Rank {

    public Soldier(Rank next, int importanceOfJob) {
        this.next = next;
        this.importanceOfJob = importanceOfJob;
    }

    @Override
    protected void completeOrder() {
        System.out.println("Executed by soldier");
    }
}
