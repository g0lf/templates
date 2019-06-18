package ru.my.patterns.structural.adapter;

/**
 *  структурный шаблон проектирования, предназначенный для организации использования функций объекта,
 *  недоступного для модификации, через специально созданный интерфейс.
 *  Другими словами — это структурный паттерн проектирования, который позволяет объектам с
 *  несовместимыми интерфейсами работать вместе.
 */
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
