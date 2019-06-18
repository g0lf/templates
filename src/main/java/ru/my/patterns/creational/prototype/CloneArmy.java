package ru.my.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Задаёт виды создаваемых объектов с помощью экземпляра-прототипа
 * и создаёт новые объекты путём копирования этого прототипа.
 * Он позволяет уйти от реализации и позволяет следовать
 * принципу «программирование через интерфейсы».
 * В качестве возвращающего типа указывается интерфейс/абстрактный класс на
 * вершине иерархии, а классы-наследники могут подставить туда наследника, реализующего этот тип.
 */
public class CloneArmy {

    private static List<CloneWarrior> armyOfClones = new ArrayList<CloneWarrior>();

    public static void main(String[] args) throws CloneNotSupportedException {
        ArmorWarrior armorWarrior = new ArmorWarrior();
        Soldier soldier = new Soldier();

        armyOfClones.add(armorWarrior);
        armyOfClones.add(soldier);
        for (int i = 0; i < 500; i++) {
            armyOfClones.add(armorWarrior.clone());
            armyOfClones.add(soldier.clone());
        }
    }

}
