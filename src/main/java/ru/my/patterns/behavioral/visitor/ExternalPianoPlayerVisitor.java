package ru.my.patterns.behavioral.visitor;

public class ExternalPianoPlayerVisitor implements Visitor {

    public void visit(JazzBand jazzBand) {
        System.out.println("Out piano player "+ jazzBand.getPianoPlayerName() + " on vacation" +
                ". So we take Gordon");
        jazzBand.setPianoPlayerName("Gordon");
        jazzBand.getInvitingParticipants().add("Gordon");
    }

    public void visit(RockGroup rockGroup) {
        System.out.println("We invited Gordon as piano player for this concert");
        rockGroup.getInvitingParticipants().add("Gordon");
    }
}
