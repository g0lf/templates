package ru.my.patterns.behavioral.visitor;

public interface Visitor {

    void visit(JazzBand jazzBand);
    void visit(RockGroup rockGroup);

}
