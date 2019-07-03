package ru.my.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public abstract class MusicGroup {

    public abstract void accept(Visitor v);

    private String groupName;
    private List<String> invitingParticipants = new ArrayList<String>();

    public List<String> getInvitingParticipants() {
        return invitingParticipants;
    }

    public void setInvitingParticipants(List<String> invitingParticipants) {
        this.invitingParticipants = invitingParticipants;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "MusicGroup{" +
                "groupName='" + groupName + '\'' +
                ", invitingParticipants=" + String.join(",", invitingParticipants) +
                '}';
    }
}
