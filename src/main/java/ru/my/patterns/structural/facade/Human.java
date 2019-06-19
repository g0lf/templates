package ru.my.patterns.structural.facade;

/**
 *  структурный шаблон проектирования, позволяющий
 *  скрыть сложность системы путём сведения всех возможных
 *  внешних вызовов к одному объекту, делегирующему их соответствующим объектам системы.
 */
public class Human {

    public static void main(String[] args) {
        BrainEngine brainEngine = new BrainEngine();
        brainEngine.makeWork();
    }

}
