package ru.my.patterns.creational.factory_method;

/**
 *  порождающий шаблон проектирования, предоставляющий
 *  подклассам (дочерним классам) интерфейс для создания
 *  экземпляров некоторого класса. В момент создания
 *  наследники могут определить, какой класс создавать.
 *  Иными словами, данный шаблон делегирует создание
 *  объектов наследникам родительского класса(в моем примере он однин - этот класс).
 */
public class WomanFactory {

    public static Woman getSpecificWoman(WomanEnum womanEnum){
        switch (womanEnum){
            default:
            case BLONDE: return new Blonde();
            case REDHEAD: return new RedHead();
            case BRUNETTE: return new Brunette();
        }
    }

    public static void main(String[] args) {
        Woman blonde = WomanFactory.getSpecificWoman(WomanEnum.BLONDE);
        System.out.println(blonde.sayNonsense());
    }

}
