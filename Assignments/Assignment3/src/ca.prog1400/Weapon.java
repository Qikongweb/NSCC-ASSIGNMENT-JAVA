package ca.prog1400;

public abstract class Weapon {
    private int weight ;
    private int attackModifier;

    public String getType() {
        return type;
    }

    private String type;

    public Weapon(String type){
        this.type = type;
        this.weight = getRandomBetweenRange(10,20);
        this.attackModifier = getRandomBetweenRange(23,34);
    }

    public int getWeight() {
        return weight;
    }

    public int getAttackModifier() {
        return attackModifier;
    }

    public void doRandomAbility(){
        this.weight = getRandomBetweenRange(1,300);
        this.attackModifier = getRandomBetweenRange(1,300);
    }

    private static int getRandomBetweenRange(int min, int max){
        return (int)((Math.random()*((max-min)+1))+min);
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "weight=" + weight +
                ", attackModifier=" + attackModifier +
                ", name='" + type + '\'' +
                '}';
    }
}
