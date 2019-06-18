package ru.my.patterns.structural.proxy;

public class AbsProxySystem implements IBrake {

    private BrakeSystem brakeSystem;

    private BrakeSystem getBrakeSystem(){
        if (brakeSystem == null){
            brakeSystem = new BrakeSystem();
        }
        return brakeSystem;
    }

    public void push() {
        System.out.println("Make additional abs push actions...");
        getBrakeSystem().push();
    }

    public void release() {
        System.out.println("Make additional abs release actions...");
        getBrakeSystem().release();
    }
}
