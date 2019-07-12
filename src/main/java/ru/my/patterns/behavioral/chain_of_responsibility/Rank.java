package ru.my.patterns.behavioral.chain_of_responsibility;

public abstract class Rank {
    public static int NOT_IMPORTANT = 3;
    public static int LITTLE_IMPORTANT = 2;
    public static int SUPER_IMPORTANT = 1;

    protected Rank next;
    protected int importanceOfJob;

    abstract protected void completeOrder();

    public void redirect(int importance){
        if (importance <  importanceOfJob){
            if (next != null) {
                next.redirect(importance);
                return;
            }
        }
        completeOrder();
    }

}
