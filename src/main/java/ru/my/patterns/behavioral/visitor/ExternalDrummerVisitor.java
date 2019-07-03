package ru.my.patterns.behavioral.visitor;

public class ExternalDrummerVisitor implements Visitor {
    public void visit(JazzBand jazzBand) {
        System.out.println("Today we invited drummer from group 'Super mega jazz band' ");
        jazzBand.getInvitingParticipants().add("Silvester");
    }

    public void visit(RockGroup rockGroup) {
        System.out.println("We don't need invite drummer? bacause we have " + rockGroup.getDrummerName());
    }
}
