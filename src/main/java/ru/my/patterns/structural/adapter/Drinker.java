package ru.my.patterns.structural.adapter;

public class Drinker {

    private static void drinkFilteredWater(IFilter filter){
        filter.getFilteredWater();
        System.out.println("i am drinking filtered water...");
    }

    public static void main(String[] args) {
        IFilter filter = new Filter(new KitchenPipe());
        drinkFilteredWater(filter);
    }

}
