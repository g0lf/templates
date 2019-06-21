package ru.my.patterns.structural.flyweight;

import ru.my.patterns.creational.factory_method.*;

import java.util.HashMap;
import java.util.Map;

/**
 * структурный шаблон проектирования,
 * при котором объект, представляющий
 * себя как уникальный экземпляр в разных местах программы, по факту не является таковым.
 * Flyweight дополняет шаблон Factory Method таким образом, что при обращении клиента к
 * Factory Method для создания нового объекта ищет уже созданный объект с такими же параметрами,
 * что и у требуемого, и возвращает его клиенту. Если такого объекта нет, то фабрика создаст новый.
 */
public class FlyweightWomanFactory {

    private Map<WomanEnum, Woman> womanMap = new HashMap<WomanEnum, Woman>();

    public Woman getSpecificWoman(WomanEnum womanEnum){
        Woman woman = womanMap.get(womanEnum);
        if (woman == null) {
            switch (womanEnum) {
                default:
                case BLONDE:
                    woman =  new Blonde();
                    break;
                case REDHEAD:
                    woman = new RedHead();
                    break;
                case BRUNETTE:
                    woman = new Brunette();
                    break;
            }
            womanMap.put(womanEnum, woman);
        }
        return woman;
    }

    public static void main(String[] args) {
        FlyweightWomanFactory flyweightWomanFactory = new FlyweightWomanFactory();
        Woman blonde = flyweightWomanFactory.getSpecificWoman(WomanEnum.BLONDE);
        System.out.println(blonde.sayNonsense());

        Woman blonde2 = flyweightWomanFactory.getSpecificWoman(WomanEnum.BLONDE);

        assert blonde == blonde2;
    }

}
