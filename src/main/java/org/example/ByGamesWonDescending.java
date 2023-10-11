package org.example;

import java.util.Comparator;

public class ByGamesWonDescending implements Comparator<LeagueEntry> {
    @Override
    public int compare(LeagueEntry l1, LeagueEntry l2) {
        return l2.getGamesWon() -l1.getGamesWon();
    }
}
