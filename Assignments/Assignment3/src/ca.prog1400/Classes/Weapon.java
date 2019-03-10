package ca.prog1400.Classes;

public abstract class Weapon {
    private int weight ;
    private int attackModifier;

    public String getType() {
        return type;
    }

    private String type;

    public Weapon(String type){
        this.type = type;
    }
    public Weapon(String type,int weight,int attackModifier){
        this.type = type;
        this.weight = weight;
        this.attackModifier = attackModifier;
    }

    public int getWeight() {
        return weight;
    }

    public int getAttackModifier() {
        return attackModifier;
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
