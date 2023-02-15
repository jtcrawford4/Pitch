package org.example.Model;

import java.util.List;

public class Team {
    private List<Player> team;
    private String teamName;
    private int points = 0;

    public Team(List<Player> players, String name){
        this.team = players;
        this.teamName = name;
    }
    public List<Player> getTeam() {
        return team;
    }
    public void setTeam(List<Player> team) {
        this.team = team;
    }
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
}
