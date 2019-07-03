package ru.my.patterns.behavioral.visitor;

public class ExternalSoloistVisitor implements Visitor {

    public void visit(JazzBand jazzBand) {
        System.out.println("Today we invited soloist from group 'Little bitches' ");
        jazzBand.getInvitingParticipants().add("Rosa");
    }

    public void visit(RockGroup rockGroup) {
        System.out.println("Today we invited soloist from group 'Super hard rock' ");
        rockGroup.getInvitingParticipants().add("David lighting");
    }
}
