package ca.prog1400;

public class Team {
    private String teamName;  //TeamName
    private double budget;    //TeamBudget
    private int teamTotal = 0;    //Team
    private Player[] player;  //Player Class

    public Team(String name) {
        this.teamName = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Player[] getPlayer() {
        return player;
    }

    public void setPlayer(Player[] player) {

        this.player = player;
    }

    //the function to calculate the total goals and assist.
    public String outPutTeamTotal() {
        int totalGoals = 0;
        int totalAssists = 0;
        for (Player pl : this.player) {
            totalGoals += pl.getGoals();
            totalAssists += pl.getAssists();
        }
        teamTotal = totalGoals + totalAssists;
        return String.format("%-17sG - %-2d\tA - %-2d\tTotal - %-2d\tBudget - $%.2f",
                this.teamName+":", totalGoals, totalAssists, teamTotal, this.budget);
    }

    //the function to calculate the Team Rate.
    public String outPutTeamRate() {
        String result;
        if (this.teamTotal > 20) {
            result = "***";
        } else if (this.teamTotal >= 10) {
            result = "**";
        } else if (this.teamTotal > 0) {
            result = "*";
        } else {
            result = "0";
        }
        return String.format("Rating: %s stars", result);
    }

}
