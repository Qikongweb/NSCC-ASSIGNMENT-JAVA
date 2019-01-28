package ca.prog1400;


import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.println("FANTASY HOCKEY APPLICATION");
        System.out.println("TEAM ENTRY");
        System.out.println("================================");

        Team[] teams = new Team[3];  //Create Teams Array

        //Enter a team name for the declared array length.
        for (int i = 0; i < teams.length; i++) {
            System.out.println(String.format("Enter name for team # %d :", i + 1));
            teams[i] = new Team(inputUserText()); //Enter the team name as soon as you create the object.
        }

        //Import the entered team objects one by one.
        System.out.println("\nPLAYER ENTRY");
        System.out.println("================================");
        for (Team team : teams) {
            System.out.println(String.format("Enter player for %s :", (team.getTeamName())));

            team.setPlayer(new Player[4]); //Create player Array into Team Class

            //Enter player information for the declared array length.
            for (int j = 0; j < team.getPlayer().length; j++) {
                System.out.println(String.format("Enter name for player # %d :", j + 1));

                //Enter the player name as soon as Create the object.
                //Invoke user input function.
                team.getPlayer()[j] = new Player(inputUserText());
                System.out.println(String.format("Enter number of goals for %s :", team.getPlayer()[j].getName()));
                //Enter the player goals and Invoke user input function.
                team.getPlayer()[j].setGoals(inputUserNum());
                System.out.println(String.format("Enter number of assists for %s :", team.getPlayer()[j].getName()));
                //Enter the player goals and Invoke user input function.
                team.getPlayer()[j].setAssists(inputUserNum());
            }
            team.setBudget(new Random().nextInt(10000001) / 100.0f); // Put a random number from 0.00 to 100000.
        }

        System.out.println("\nREPORT: Stats per Team");
        System.out.println("================================");
        for (Team team : teams) {
            System.out.println(team.outPutTeamTotal()); // call function for the Team report
            System.out.println(team.outPutTeamRate());  // call function for the Team total rate

        }
        System.out.println("\nREPORT: Stats per Player");
        System.out.println("================================");

        for (Team team : teams) {
            for (int j = 0; j < team.getPlayer().length; j++) {
                System.out.println(team.getTeamName());
                System.out.println(team.getPlayer()[j].outPutPlayerDetail()); //Invoke player detail function
            }
        }

    }


    // Enter User characters and Validate User Text .
    private static String inputUserText() {
        String result;
        Scanner scanner = new Scanner(System.in);
        do {
            result = scanner.nextLine();
            // used to print warning message.
            if (result.length() < 3) {
                System.out.println("Please enter a name latest 3!");
            }

        } while (result.length() < 3);

        return result;
    }

    //Enter User characters and Validate User Number.
    private static int inputUserNum() {
        int result;
        Scanner scanner = new Scanner(System.in);
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Enter a positive number.");
                scanner.next();
            }
            result = scanner.nextInt();

            // used to print warning message.
            if (result < 0) {
                System.out.println("Enter a positive number.");
            }

        } while (result < 0);
        return result;
    }
}

