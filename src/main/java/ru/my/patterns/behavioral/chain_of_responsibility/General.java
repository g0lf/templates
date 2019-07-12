package ru.my.patterns.behavioral.chain_of_responsibility;

public class General extends Rank {

    public General(Rank next, int importanceOfJob) {
        this.next = next;
        this.importanceOfJob = importanceOfJob;
    }

    @Override
    protected void completeOrder() {
        System.out.println("Execute by general");
    }
}
