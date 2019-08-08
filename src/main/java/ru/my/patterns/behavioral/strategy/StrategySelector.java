package ru.my.patterns.behavioral.strategy;

public class StrategySelector {

    private PickUpStrategy pickUpStrategy;

    public void setPickUpStrategy(PickUpStrategy pickUpStrategy){
        this.pickUpStrategy = pickUpStrategy;
    }

    public void executeStrategy(){
        pickUpStrategy.execute();
    }

}
