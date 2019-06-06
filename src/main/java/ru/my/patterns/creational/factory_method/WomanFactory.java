package ru.my.patterns.creational.factory_method;

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
