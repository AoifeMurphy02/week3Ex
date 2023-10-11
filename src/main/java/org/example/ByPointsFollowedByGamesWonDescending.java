package org.example;

import java.util.Comparator;

public class ByPointsFollowedByGamesWonDescending implements Comparator<LeagueEntry> {

    public int compare(LeagueEntry l1, LeagueEntry l2) {
        if(l1.getTotalPoints() == l1.getTotalPoints()){
            return l2.getGamesWon() - l1.getGamesWon();
        }
        else{
            return l2.getTotalPoints() - l1.getTotalPoints();
        }

    }


}
