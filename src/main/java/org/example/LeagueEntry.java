package org.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LeagueEntry implements Comparable<LeagueEntry> {
   //	Create a class “LeagueEntry” to represent an entry in the premier league table. Each entry should include the following fields:
    //	Name
    //	Games played
    //	Games won
    //	Games lost
    //	Games Drew
    //	Total Points

    private String name;
    private int gamesWon;
    private int gamesLost;
    private int gamesDrew;
    private int totalPoints;
    private int gamesPlayed;

    // 	You should also implement the following in your class:
    //	Full and default constructors
    //	Getters and setters
    //	toString method

    //	Full and default constructors
    public LeagueEntry() {
    }

    public LeagueEntry(String name, int gamesWon, int gamesLost, int gamesDrew, int totalPoints, int gamesPlayed) {
        this.name = name;
        this.gamesWon = gamesWon;
        this.gamesLost = gamesLost;
        this.gamesDrew = gamesDrew;
        this.gamesPlayed = gamesPlayed;
        this.totalPoints = totalPoints;
    }
    //	Getters and setters


    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public void setGamesLost(int gamesLost) {
        this.gamesLost = gamesLost;
    }

    public int getGamesDrew() {
        return gamesDrew;
    }

    public void setGamesDrew(int gamesDrew) {
        this.gamesDrew = gamesDrew;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }
    //	toString method


    @Override
    public String toString() {
        return "LeagueEntry{" +
                "name='" + name + '\'' +
                ", gamesWon=" + gamesWon +
                ", gamesLost=" + gamesLost +
                ", gamesDrew=" + gamesDrew +
                ", totalPoints=" + totalPoints +
                ", gamesPlayed=" + gamesPlayed +
                '}';
    }

    @Override
    public int compareTo(LeagueEntry other) {
        if(this.totalPoints != other.totalPoints){
            return other.totalPoints - this.totalPoints;
        }
        else if(this.gamesWon != other.gamesWon){
            return other.gamesWon - this.gamesWon;
        }
        else if(this.name != other.name){
            return this.name.compareTo(other.name);
        }
        return 0;
    }
//    @Override
//    public int compareTo(LeagueEntry o) {
//        return this.name.compareTo(o.name);
//    }

}
