package ru.my.patterns.creational.builder;

public class BreakfastBuilder {

    private Breakfast breakfast;

    public BreakfastBuilder() {
        this.breakfast = new Breakfast();
    }

    public BreakfastBuilder setDrink(String drink){
        breakfast.setDrink(drink);
        return this;
    }

    public BreakfastBuilder setGirlName(String girlName){
        breakfast.setGirlName(girlName);
        return this;
    }

    public BreakfastBuilder setEggs(int eggs){
        breakfast.setEggs(eggs);
        return this;
    }

    public BreakfastBuilder setNeedMilk(boolean needMilk){
        breakfast.setNeedMilk(needMilk);
        return this;
    }

    public BreakfastBuilder setNeedBread(boolean needBread){
        breakfast.setNeedBread(needBread);
        return this;
    }

    public Breakfast build(){
        return breakfast;
    }

    public static void main(String[] args) {
        Breakfast breakfast = new BreakfastBuilder()
                .setDrink("coffee")
                .setEggs(3)
                .setGirlName("Amy")
                .setNeedBread(true)
                .setNeedMilk(true)
                .build();
        System.out.print(breakfast.toString());
    }
}
