package ru.my.patterns.structural.proxy;

public class Main {

    public static void main(String[] args) {
        IBrake absBrake = new AbsProxySystem();
        absBrake.push();
        absBrake.release();
    }
}
