package ru.my.patterns.behavioral.visitor;

/**
 *  поведенческий шаблон проектирования, описывающий операцию,
 *  которая выполняется над объектами других классов.
 *  При изменении visitor
 *  нет необходимости изменять обслуживаемые классы.
 */
public class FormConcertGroup {

    public static void main(String[] args) {
        JazzBand jazzBand = new JazzBand("Jessica", "Alex", "Epifanty");
        jazzBand.setGroupName("Native jazz band");

        ExternalPianoPlayerVisitor visitor = new ExternalPianoPlayerVisitor();
        jazzBand.accept(visitor);

        System.out.println(jazzBand.toString());
    }

}
