package ca.prog1400;

public  class Player extends Character{
    Weapon weapon;
    public Player(String name) {
        super(name);

    }
    public Player(Player player,Weapon weapon) {
        super(player.getName());
        this.weapon = weapon;
    }

    public static String getSummary(Player player, Weapon weapon){
        return player.getName() + weapon.getWeight();
    }

    @Override
    public String toString() {
        return "Player{" +
                "weapon=" + weapon +
                '}';
    }
}
