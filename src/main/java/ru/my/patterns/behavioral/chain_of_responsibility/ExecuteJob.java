package ru.my.patterns.behavioral.chain_of_responsibility;

/**
 *  шаблон проектирования,
 *  предназначенный для организации в системе уровней ответственности.
 */
public class ExecuteJob {

    public static void main(String[] args) {
        Rank general = new General(null, Rank.SUPER_IMPORTANT);
        Rank sergeant = new Sergeant(general, Rank.LITTLE_IMPORTANT);
        Rank soldier = new Soldier(sergeant, Rank.NOT_IMPORTANT);

        soldier.redirect(Rank.NOT_IMPORTANT);
        soldier.redirect(Rank.LITTLE_IMPORTANT);
        soldier.redirect(Rank.SUPER_IMPORTANT);
    }

}
