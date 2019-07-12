package ru.my.patterns.behavioral.chain_of_responsibility;

public class Sergeant extends Rank {

    public Sergeant(Rank next, int importanceOfJob) {
        this.next = next;
        this.importanceOfJob = importanceOfJob;

    }

    @Override
    protected void completeOrder() {
        System.out.println("Execute by sergeant");
    }
}
