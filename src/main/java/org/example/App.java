package org.example;

import java.util.Scanner;

public class App {

    //•	Define a main class to create a league with the following teams
//o	Arsenal
//o	Manchester United
//o	Liverpool
//o	Aston Villa
//o	Bournemouth
//o	Brentford
//o	Everton
//o	Fulham
//o	Man City
//o	Tottenham
    public static void main(String[] args) {
        League league = new League();
       league.add( new LeagueEntry("Arsenal", 0,0,0,0,0));
        league.add( new LeagueEntry("Manchester United", 0,0,0,0,0));
        league.add( new LeagueEntry("Liverpool", 0,0,0,0,0));
        league.add( new LeagueEntry("Aston Villa", 0,0,0,0,0));
        league.add( new LeagueEntry("Bournemouth", 0,0,0,0,0));
        league.add( new LeagueEntry("Brentford",0,0,0,0,0));
        league.add( new LeagueEntry("Everton",0,0,0,0,0));
        league.add( new LeagueEntry("Fulham",0,0,0,0,0));
        league.add( new LeagueEntry("Man City",0,0,0,0,0));
        league.add( new LeagueEntry("Tottenham",0,0,0,0,0));
        league.display();

        //	Create a UI to allow a user do the following
        //	Play a game (Team names entered manually)
        //	View the league in any of the available orderings

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Play a game");
            System.out.println("2. View the league table");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (choice == 1) {
                System.out.print("Enter team 1 name: ");
                String team1Name = scanner.nextLine();
                System.out.print("Enter team 2 name: ");
                String team2Name = scanner.nextLine();

                LeagueEntry team1 = league.searchByName(team1Name);
                LeagueEntry team2 = league.searchByName(team2Name);

                if (team1 != null && team2 != null) {
                    league.playMatch(team1, team2);
                    System.out.println("Match played and results updated.");
                } else {
                    System.out.println("One or both teams not found in the league.");
                }
            } else if (choice == 2) {
                league.sort();
                league.display();
            } else if (choice == 3) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}







