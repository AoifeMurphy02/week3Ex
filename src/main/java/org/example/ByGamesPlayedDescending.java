package org.example;

import java.util.Comparator;

public class ByGamesPlayedDescending implements Comparator<LeagueEntry> {
    @Override
    public int compare(LeagueEntry l1, LeagueEntry l2) {
        return l2.getGamesPlayed() - l1.getGamesPlayed();
    }
}
