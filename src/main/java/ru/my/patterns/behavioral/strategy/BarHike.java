package ru.my.patterns.behavioral.strategy;

/**
 *  поведенческий шаблон проектирования, предназначенный для определения
 *  семейства алгоритмов, инкапсуляции каждого из них и обеспечения их взаимозаменяемости.
 *  Это позволяет выбирать алгоритм путём определения соответствующего класса.
 *  Шаблон Strategy позволяет менять выбранный алгоритм независимо от объектов-клиентов, которые его используют.
 */
public class BarHike {

    public static void main(String[] args) {
        StrategySelector ss = new StrategySelector();
        ss.setPickUpStrategy(new DirectStrategy());
        ss.executeStrategy();

        ss.setPickUpStrategy(new AlcoStrategy());
        ss.executeStrategy();

        ss.setPickUpStrategy(new ChCl3Strategy());
        ss.executeStrategy();
    }

}
