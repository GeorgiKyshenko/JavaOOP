package _02_Encapsulation._01_Encapsulation_labTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private String name;
    private List<Person> firstTeam;
    private List<Person> reservedTeam;

    public Team(String name) {
        this.setName(name);
        this.firstTeam = new ArrayList<>();
        this.reservedTeam = new ArrayList<>();
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Person player) {
        if (player.getAge() < 40) {
            firstTeam.add(player);
        } else {
            reservedTeam.add(player);
        }
    }

    public List<Person> getFirstTeam() {
        return Collections.unmodifiableList(firstTeam);
    }

    public List<Person> getReservedTeam() {
        return Collections.unmodifiableList(reservedTeam);
    }
}
