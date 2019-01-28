package ca.prog1400;

public class Player {
    private String name;    //Player Name
    private int goals;      //Player Goals
    private int assists;    //Player Assists


    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    //the function to show list of player.
    public String outPutPlayerDetail() {
        return String.format("%-16sG - %-2d\tA - %-2d\tTotal - %-2d",
                this.name + ":", this.goals, this.assists, this.goals + this.assists);
    }

}
