package ru.my.patterns.behavioral.visitor;

import java.util.List;

public class RockGroup extends MusicGroup {

    private List<String> guitarPlayerNamesList;
    private String drummerName;

    public RockGroup(List<String> guitarPlayerNamesList, String drummerName) {
        this.guitarPlayerNamesList = guitarPlayerNamesList;
        this.drummerName = drummerName;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    public List<String> getGuitarPlayerNamesList() {
        return guitarPlayerNamesList;
    }

    public void setGuitarPlayerNamesList(List<String> guitarPlayerNamesList) {
        this.guitarPlayerNamesList = guitarPlayerNamesList;
    }

    public String getDrummerName() {
        return drummerName;
    }

    public void setDrummerName(String drummerName) {
        this.drummerName = drummerName;
    }
}
