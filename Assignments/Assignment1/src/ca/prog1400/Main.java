package ca.prog1400;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("FANTASY HOCKEY APPLICATION");
        System.out.println("TEAM ENTRY");
        System.out.println("================================");

        Team teams [] = new Team[1];
        for (int i = 0; i <teams.length ; i++) {
            System.out.println("Enter name for team # " + (i + 1) + ":");
            teams[i] = new Team();
            teams[i].setTeamName(scanner.next());
        }

        for(Team team : teams){
            System.out.println("\nPLAYER ENTRY");
            System.out.println("================================");
            team.setPlayer(new Player[1]);
            for(int j =0 ; j<team.getPlayer().length;j++){
                System.out.println("Enter name for player #" + team.getTeamName() + ":");
                team.getPlayer()[j] = new Player(scanner.next());
                System.out.println("Enter number of goals for " + team.getPlayer()[j].getName());
                team.getPlayer()[j].setGolas(scanner.nextInt());
                System.out.println("Enter number of assists for " + team.getPlayer()[j].getName());
                team.getPlayer()[j].setAssists(scanner.nextInt());
            }
            team.setBudget(new Random().nextFloat()*100000);


        }

        System.out.println("REPORT: Stats per Team");
        System.out.println("================================");
        for(Team team:teams){
            team.stateTeamPoint();
        }
        System.out.println("REPORT: Stats per Player");
        System.out.println("================================");
        for(Team team:teams){
            team.outputPlayerDetails();
        }
    }
}

