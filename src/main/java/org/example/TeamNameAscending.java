package org.example;

import java.util.Comparator;

public class TeamNameAscending  implements Comparator<LeagueEntry> {
    @Override
    public int compare(LeagueEntry l1, LeagueEntry l2) {
        return l1.getName().compareTo(l2.getName());
    }
}
