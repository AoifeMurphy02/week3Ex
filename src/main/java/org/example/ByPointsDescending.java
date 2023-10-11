package org.example;

import java.util.Comparator;

public class ByPointsDescending implements Comparator<LeagueEntry> {
    @Override
    public int compare(LeagueEntry l1, LeagueEntry l2) {
       return l2.getTotalPoints() - l1.getTotalPoints();
    }
}
