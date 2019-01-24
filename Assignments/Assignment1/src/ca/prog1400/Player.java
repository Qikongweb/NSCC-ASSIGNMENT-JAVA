package ca.prog1400;

public class Player {
    String name;
    int golas;
    int assists;


    public Player(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGolas() {
        return golas;
    }

    public void setGolas(int golas) {
        this.golas = golas;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }


}
