package ru.my.patterns.behavioral.visitor;

public class JazzBand extends MusicGroup {

    private String soloistName;
    private String bassGuitarPlayerName;
    private String pianoPlayerName;

    public JazzBand(String soloistName, String bassGuitarPlayerName, String pianoPlayerName) {
        this.soloistName = soloistName;
        this.bassGuitarPlayerName = bassGuitarPlayerName;
        this.pianoPlayerName = pianoPlayerName;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getSoloistName() {
        return soloistName;
    }

    public void setSoloistName(String soloistName) {
        this.soloistName = soloistName;
    }

    public String getBassGuitarPlayerName() {
        return bassGuitarPlayerName;
    }

    public void setBassGuitarPlayerName(String bassGuitarPlayerName) {
        this.bassGuitarPlayerName = bassGuitarPlayerName;
    }

    public String getPianoPlayerName() {
        return pianoPlayerName;
    }

    public void setPianoPlayerName(String pianoPlayerName) {
        this.pianoPlayerName = pianoPlayerName;
    }

    @Override
    public String toString() {
        return "JazzBand{" +
                "soloistName='" + soloistName + '\'' +
                ", bassGuitarPlayerName='" + bassGuitarPlayerName + '\'' +
                ", pianoPlayerName='" + pianoPlayerName + '\'' +
                "} " + super.toString();
    }
}
