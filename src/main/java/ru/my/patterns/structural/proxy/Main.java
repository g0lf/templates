package ru.my.patterns.structural.proxy;

/**
 * структурный шаблон проектирования, предоставляющий объект,
 * который контролирует доступ к другому объекту, перехватывая все вызовы (выполняет функцию контейнера)
 */
public class Main {

    public static void main(String[] args) {
        IBrake absBrake = new AbsProxySystem();
        absBrake.push();
        absBrake.release();
    }
}
