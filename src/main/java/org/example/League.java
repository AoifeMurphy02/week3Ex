package org.example;

import java.util.*;

public class League {
    //Create a class League made up of multiple LeagueEntry’s. In this class include
     List<LeagueEntry> entries = new ArrayList<>();

    public void add(LeagueEntry e){
        entries.add(e);
    }

    //	Display Method to display the league as a table
    //	PlayMatch to play a match between two teams (Randomly generate the score between the teams)


    public void display(){
        System.out.println("League Table:");
        for (LeagueEntry entry : entries) {
            System.out.println(entry);
        }
    }
    public void sort(){
        Collections.sort(entries);
    }
    //	PlayMatch to play a match between two teams (Randomly generate the score between the teams)
    public void playMatch(LeagueEntry team1, LeagueEntry team2){
        Random random = new Random();
        int team1Score = random.nextInt(11);
        int team2Score = random.nextInt(11);

        team1.setGamesPlayed(team1.getGamesPlayed() + 1);
        team2.setGamesPlayed(team2.getGamesPlayed() + 1);

        if (team1Score > team2Score) {
            team1.setGamesWon(team1.getGamesWon() + 1);
            team2.setGamesLost(team2.getGamesLost() + 1);
            team1.setTotalPoints(team1.getTotalPoints() + 3);
        } else if (team1Score < team2Score) {
            team2.setGamesWon(team2.getGamesWon() + 1);
            team1.setGamesLost(team1.getGamesLost() + 1);
            team2.setTotalPoints(team2.getTotalPoints() + 3);
        } else {
            team1.setGamesDrew(team1.getGamesDrew() + 1);
            team2.setGamesDrew(team2.getGamesDrew() + 1);
            team1.setTotalPoints(team1.getTotalPoints() + 1);
            team2.setTotalPoints(team2.getTotalPoints() + 1);
        }

        }
    public LeagueEntry searchByName(String name) {
        for (LeagueEntry entry : entries) {
            if (entry.getName().equalsIgnoreCase(name)) {
                return entry;
            }
        }
        return null;
    }


}



