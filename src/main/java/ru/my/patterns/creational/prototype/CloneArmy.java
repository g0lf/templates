package ru.my.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

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
