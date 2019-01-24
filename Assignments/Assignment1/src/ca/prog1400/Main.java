package ca.prog1400;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("FANTASY HOCKEY APPLICATION");
        System.out.println("TEAM ENTRY");
        System.out.println("================================");

        Team teams [] = new Team[1];
        for (int i = 0; i <teams.length ; i++) {
            System.out.println("Enter name for team # " + (i + 1) + ":");
            teams[i] = new Team();
            teams[i].setTeamName(checkName());
        }

        for(Team team : teams){
            System.out.println("\nPLAYER ENTRY");
            System.out.println("================================");
            team.setPlayer(new Player[1]);
            for(int j =0 ; j<team.getPlayer().length;j++){
                System.out.println("Enter name for player #" + team.getTeamName() + ":");
                team.getPlayer()[j] = new Player(checkName());
                System.out.println("Enter number of goals for " + team.getPlayer()[j].getName());
                team.getPlayer()[j].setGolas(checkNumber());
                System.out.println("Enter number of assists for " + team.getPlayer()[j].getName());
                team.getPlayer()[j].setAssists(checkNumber());
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
    private static String checkName(){
        String result = "";
        Scanner scanner = new Scanner(System.in);
        do{
           while(!scanner.hasNextLine()){
               if(scanner.nextLine().length() < 3){
                   System.out.println("Please enter team name  least 3 characters.");
               }
               System.out.println("Please enter a valid word!");
               scanner.next();
           }
           result = scanner.nextLine();
        }while(result == null || result.equals("") || result.length() < 3);

        return result;
    }

    private static int checkNumber(){
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            while(!scanner.hasNextInt()){
                System.out.println("Please enter a number  greater than 0.");
                scanner.next();
            }
            result = scanner.nextInt();
        }while(result < 0);

        return result;
    }
}

