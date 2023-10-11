package org.example;

import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        League le1 = new League();
        LeagueEntry t1 = new LeagueEntry("hhh", 1,2,3,4,6);
        LeagueEntry t2 = new LeagueEntry("ccc", 1,0,0,1,1);
        le1.add(t1);
        le1.add(t2);
        le1.display();
        System.out.println("TeamNameAscending");
        TeamNameAscending tna = new TeamNameAscending();
        Collections.sort(le1.entries, tna);
        le1.display();
        System.out.println("ByPointsDescending");
        ByPointsDescending bpd = new ByPointsDescending();
        Collections.sort(le1.entries, bpd);
        le1.display();
        System.out.println(" ByGamesPlayedDescending");
        ByGamesPlayedDescending bgpd = new ByGamesPlayedDescending();
        Collections.sort(le1.entries,bgpd);
        le1.display();
        System.out.println("ByPointsFollowedByGamesWonDescending");
        ByPointsFollowedByGamesWonDescending bpbgw = new ByPointsFollowedByGamesWonDescending();
        Collections.sort(le1.entries,bpbgw);
        le1.display();

    }

}