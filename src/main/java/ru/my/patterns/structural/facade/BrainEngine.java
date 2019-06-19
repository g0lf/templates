package ru.my.patterns.structural.facade;

public class BrainEngine {

    private MakeBreath makeBreath;
    private MakeSee makeSee;
    private MakeStep makeStep;
    private MakeVoice makeVoice;

    public BrainEngine() {
        this.makeBreath = new MakeBreath();
        this.makeSee = new MakeSee();
        this.makeStep = new MakeStep();
        this.makeVoice = new MakeVoice();
    }

    public void makeWork(){
        makeBreath.breath();
        makeSee.see();
        makeStep.step();
        makeVoice.speak();
    }
}
