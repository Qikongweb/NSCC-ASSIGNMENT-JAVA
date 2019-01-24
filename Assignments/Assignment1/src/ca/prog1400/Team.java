package ca.prog1400;

public class Team {
    String teamName;
    double budget;
    Player player[];

    public double getBudget() {
        return budget;
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

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void stateTeamPoint(){
        int totalGoals = 0;
        int totalAssists = 0;
        int total = 0;
        String rate = "";
        for(Player elem : this.player){
            totalGoals += elem.getGolas();
            totalAssists += elem.getAssists();
        }
        total = totalGoals + totalAssists;
        System.out.println(String.format("%s:\tG - %d\tA - %d\tTotal - %d\tBudget - $%.2f",
                this.teamName,totalGoals,totalAssists,total,this.getBudget()));

        if(total > 20){
            rate = "***";
        }else if(total >=10){
            rate = "**";
        }else if(total > 0){
            rate = "*";
        }else{
            rate = "0";
        }
        System.out.println(String.format("Rating: %s stars",rate));
    }
    public void outputPlayerDetails(){
        System.out.println(this.teamName);
        for(Player pl: this.player){
            System.out.println(String.format("%s:\tG - %d\tA - %d\t\tTotal - %d",
                                pl.getName(),pl.getGolas(),pl.getAssists(),pl.getGolas()+pl.getAssists()));
        }
    }
}
