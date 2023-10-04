package org.example;

public class LeagueEntry {
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
    private double totalPoints;

    // 	You should also implement the following in your class:
    //	Full and default constructors
    //	Getters and setters
    //	toString method

    //	Full and default constructors
    public LeagueEntry() {
    }

    public LeagueEntry(String name, int gamesWon, int gamesLost, int gamesDrew, double totalPoints) {
        this.name = name;
        this.gamesWon = gamesWon;
        this.gamesLost = gamesLost;
        this.gamesDrew = gamesDrew;
        this.totalPoints = totalPoints;
    }
    //	Getters and setters


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

    public double getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(double totalPoints) {
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
                '}';
    }
}
